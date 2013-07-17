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
        (WS? Contains WS? Newline)?
        (contentBlock)*
        WS? End WS Program WS? Identifier? WS? Newline?
    ;

// a file can contain multiple module blocks
moduleBlock
    :
        WS? Module WS Identifier WS? Newline
        (interfaceLine | contentBlock)*
        (WS? Contains WS? Newline)?
        contentBlock?
        WS? End WS Module WS? Identifier? Newline?
    ;
// a template block contains functions or subroutines and is used to create 
// a generic interface or a generic type bound procedure
templateBlock
    :
        WS? Prefix WS Template WS? Identifier? Newline
        (contentBlock)?
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
        (placeholder | ~(Function|Newline))* Function WS Identifier (~Newline)* Newline
        (contentBlock)?
        WS? End WS Function WS? Identifier? WS? Newline
    ;

// a subroutine block, no return type
subroutineBlock
    :
        WS? Recursive? WS? Subroutine WS Identifier (~Newline)* Newline
        (contentBlock)?
        WS? End WS Subroutine WS? Identifier? WS? Newline
    ;

// a definition of a type with possibly included generic templates
typeDefinitionBlock
    :
        WS? Type WS? (WS? ',' WS? typeAttributes)* WS? (':'':')? WS? Identifier (~Newline)* Newline
        (contentBlock)?
        (WS? Contains WS? Newline)?
        (contentBlock | genericTypeBoundLine)*
        WS? End WS Type WS? Identifier? WS? Newline
    ;

// a fortran interface block
fortranInterfaceBlock
    :
        WS? Interface WS? Identifier? WS? Newline
        (
            WS? (Module)? WS? Procedure WS Identifier (WS? ',' WS? Identifier)* WS? Newline
        |
            procedureBlock
        )*
        WS? End WS Interface WS? Identifier? WS? Newline
    ;

// type atributes are part of type definitions
typeAttributes
    :
        (
            Private
        |
            Public
        |
            Sequence
        |
            Abstract
        )
    |        
        (Extends | Bind) WS? '(' WS? Identifier WS? ')'
    ;

genericTypeBoundLine
    :
        WS? Prefix WS Generic WS? ( WS? ',' WS? (Private | Public))* WS? ':'':' WS? Identifier WS? AssignPointer WS? Identifier WS? Newline
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
            typeDefinitionBlock
        |
            fortranInterfaceBlock
        |
            lineComment
        |
            contentLine
        )+
    ;

// content blocks are build up of content lines
contentLine
    :
        WS? 
        (
            placeholder 
        | 
            ~(
                Prefix 
             | 
                Subroutine 
             | 
                Function 
             | 
                Contains 
             | 
                Module
             | 
                Program
             )
        )*? 
        ( Newline | lineComment)
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

// the last rule is an line comment
lineComment
    :
        WS? '!' ~('$') (placeholder | ~(Newline))* Newline
    ;

// token definitions
Assign          :   '=';
Comma           :   ',';
Semicolon       :   ';';
Colon           :   ':';
LeftBrace       :   '{';
RightBrace      :   '}';
Dollar          :   '$';
LeftParen       :   '(';
RightParen      :   ')';
LeftBracket     :   '[';
RightBracket    :   ']';
Smaller         :   '<';
Larger          :   '>';
Exclamation     :   '!';

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
Procedure       :   [Pp][Rr][Oo][Cc][Ee][Dd][Uu][Rr][Ee] ;
Recursive       :   [Rr][Ee][Cc][Uu][Rr][Ss][Ii][Vv][Ee] ;
Type            :   [Tt][Yy][Pp][Ee] ;
Extends         :   [Ee][Xx][Tt][Ee][Nn][Dd][Ss] ; 
Private         :   [Pp][Rr][Ii][Vv][Aa][Tt][Ee] ;
Public          :   [Pp][Uu][Bb][Ll][Ii][Cc] ;
Sequence        :   [Ss][Ee][Qq][Uu][Ee][Nn][Cc][Ee] ;
Abstract        :   [Aa][Bb][Ss][Tt][Rr][Aa][Cc][Tt] ;
Bind            :   [Bb][Ii][Nn][Dd] ;
Generic         :   [Gg][Ee][Nn][Ee][Rr][Ii][Cc] ;


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

AssignPointer
    :
        '=' '>'
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
