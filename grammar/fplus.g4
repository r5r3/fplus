/*
 * @author  Robert Schuster
 * 
 * fplus language extensions work like OpenMP with a preprocessor like syntax, every command 
 * starts with !$fp or !$FP
 */

grammar fplus;

// the parser can handle program and module files
fortranFile
    :
    (moduleBlock | contentBlock)*
    programBlock?
    contentBlock?
    ;

// a file can contain one program block
programBlock
    :
        WS? Program WS Identifier WS? Newline
        (contentBlock)*        
        WS? End WS Program WS? Identifier? WS? Newline?
    ;

// a file can contain multiple module blocks
moduleBlock
    :
        WS? Module WS Identifier WS? Newline
        (contentBlock | interfaceLine)*
        WS? Contains WS? Newline
        contentBlock?
        WS? End WS Module WS? Identifier? Newline?
    ;
// a template block contains functions or subroutines and is used to create 
// a generic interface or a generic type bound procedure
templateBlock
    :
        WS? Prefix WS Template WS? Identifier? Newline
        contentBlock*
        WS? Prefix WS End WS Template WS? Identifier? Newline 
    ;

// a loop block is used to repeat the code lines inside
loopBlock
    :
        loopBegin WS? Newline
        contentBlock
        WS? Prefix WS End WS Do WS? Newline
    ;

// a loop is started with one of these alternatives
loopBegin
    :   
        WS? Prefix WS Do WS listAssignment
    ;

// a function or subroutine block
procedureBlock
    :
        functionBlock
    |
        subroutineBlock
    ;

// a function block, can have a return type
functionBlock
    :
        (~Function)* Function WS Identifier (~Newline)* Newline
        (contentBlock)?
        WS? End WS Function WS? Identifier? WS? Newline
    ;

// a subroutine block, no return type
subroutineBlock
    :
        WS? Subroutine WS Identifier (~Newline)* Newline
        (contentBlock)?
        WS? End WS Subroutine WS? Identifier? WS? Newline
    ;

// the interface definition for templates
interfaceLine
    :
        WS? Prefix WS Interface WS Template WS Identifier WS? Newline
    ;

// used to initialize arrays of replacements
list
    :
       listItem (WS listItem)*
    ;

// one element of an replacement array
listItem
    :
        '{' (~Newline)*? '}'
    |
        ~Newline
    ;

// this rule creates an array of replacements
listAssignment
    :
        Identifier WS? '=' WS? IntegerConstant WS? ',' WS? IntegerConstant
    |
        Identifier WS? '=' WS? list
    ;

// a content block is found inside a loop and contains everything 
// and placeholders to be replaced. It is allowed to by empty
contentBlock
    :
        (
            loopBlock 
        |
            templateBlock
        |
            variableDefinition 
        |
            procedureBlock
        | 
            contentLine
        )+
    ;

// content blocks are build up of content lines
contentLine
    :
        (placeholder | ~Prefix)*? Newline
    ;

// a placeholder used in content blocks
placeholder
    :
        '$' '{' Identifier '}'
    |
        '$' '{' Identifier '(' Identifier ')' '}'
    ;

// variable definition, such a variable can be used everywhere in the same scope unit
variableDefinition
    :
        WS? Prefix WS listAssignment WS? Newline
    ;

// token definitions
Assign          :   '=';
Comma           :   ',';
Semicolon       :   ';';
LeftBrace       :   '{';
RightBrace      :   '}';
Dollar          :   '$';
LeftParen       :   '(';
RightParen      :   ')';
LeftBracket     :   '[';
RightBracket    :   ']';

// All commands start with this prefix
Prefix          :   '!$'[Ff][Pp] ;

// Key words, case insensitive
Template        :   [Tt][Ee][Mm][Pp][Ll][Aa][Tt][Ee] ;
Interface       :   [Ii][Nn][Tt][Ee][Rr][Ff][Aa][Cc][Ee] ;
End             :   [Ee][Nn][Dd] ;
Do              :   [Dd][Oo] ;    
Program         :   [Pp][Rr][Oo][Gg][Rr][Aa][Mm] ;
Module          :   [Mm][Oo][Dd][Uu][Ll][Ee] ;
Contains        :   [Cc][Oo][Nn][Tt][Aa][Ii][Nn][Ss] ;
Function        :   [Ff][Uu][Nn][Cc][Tt][Ii][Oo][Nn] ;
Subroutine      :   [Ss][Uu][Bb][Rr][Oo][Uu][Tt][Ii][Nn][Ee] ;


Identifier
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;

IntegerConstant
    :   
        Digit+
    ;

fragment Nondigit
    :   [a-zA-Z_]
    ;

fragment NonzeroDigit
    :   [1-9]
    ;

fragment Digit
    :   [0-9]
    ;

StringLiteral
    :
        '"' .*? '"'
    ;

// New lines are not skipped
Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
    ;

// Any Whitespace is skipped
WS
    :   [ \t]+
//        -> skip
    ;

// Everything that has not been matched before is matched here by this Token:
Noise
    :
        (~('\n'|'\r'))+?
    ;
