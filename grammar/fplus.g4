/*
 * @author  Robert Redl
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
        containsLine?
        (contentBlock)*
        WS? End WS Program WS? Identifier? WS? Newline?
    ;

// a file can contain multiple module blocks
moduleBlock
    :
        WS? Module WS Identifier WS? Newline
        (interfaceLine | contentBlock)*
        containsLine?
        contentBlock?
        WS? End WS Module WS? Identifier? Newline?
    ;

// separate declaration part from content part in modules and programs 
containsLine
    :
        WS? Contains WS? Newline
    ;

// a template block contains functions or subroutines and is used to create 
// a generic interface or a generic type bound procedure
templateBlock
    :
        WS? Prefix WS Template WS? Identifier? WS? OperatorOverload? WS? Newline
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
        (placeholder | ~(Function|Newline))* Function WS Identifier (WS? parameterList)? (WS? functionResult)? (WS? procedureBinding)? WS? Newline
        (contentBlock)?
        WS? End WS Function WS? Identifier? WS? Newline
    ;

// a subroutine block, no return type
subroutineBlock
    :
        WS? (Recursive | Elemental)? WS? Subroutine WS Identifier (WS? parameterList)? (WS? procedureBinding)? WS? Newline
        (contentBlock)?
        WS? End WS Subroutine WS? Identifier? WS? Newline
    ;

// a list of parameters for funcions and procedures
parameterList
    :
        '(' ( WS? parameterListElement
                (
                    ( WS? ',' WS? parameterListElement)
                |
                    WS? lineContinuation (ifStatement)*
                )*
            )?
        WS? ')'
    ;

parameterListElement
    :
        ( ~Newline | lineContinuation (ifStatement)* )
    ;


functionResult
    :
        Identifier WS? '(' WS? Identifier WS? ')'
    ;

procedureBinding
    :
        Bind WS? '(' WS? Identifier (WS? ',' WS? Identifier WS? '=' WS? StringLiteral)? WS? ')'
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

dataType
    :
        (
            (
                Integer
            |
                Real
            |
                Complex
            |
                Logical
            |
                Character
            )
            WS?
            ('(' WS? (
                        Kind WS? '=' WS?
                     |
                        Len WS? '=' WS?
                     )? (Identifier | IntegerConstant) WS? ')'
            )?
        |
            Type WS? '(' WS? Identifier WS? ')'
        |
            Class WS? '(' WS? Identifier WS? ')'
        )
    ;

dataTypeParameter
    :
       Pointer
    ;

// a fortran interface block
fortranInterfaceBlock
    :
        WS? Interface WS? Identifier? WS? OperatorOverload? WS? Newline
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
        WS? Prefix WS Interface WS Template WS Identifier WS? OperatorOverload? WS? Newline
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

// if statement are possible in single lines and also in complete blocks
ifStatement
    :
        ifBlock
    |
        ifSingleLine
    ;

ifSingleLine
    :
        WS? Prefix WS If WS? '(' WS? logicalExpr WS? ')' WS? contentLine
    ;

ifBlock
    :
        WS? Prefix WS If WS? '(' WS? logicalExpr WS? ')' WS? Then WS? Newline
        contentBlock
        (
            WS? Prefix WS Else WS? Newline
            contentBlock
        )?
        WS? Prefix WS End WS If WS? Newline
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
            ifStatement
        |
            procedureBlock
        |
            typeDefinitionBlock
        |
            fortranInterfaceBlock
        |
            inPlaceOperationLine
        |
            contentLine
        )+
    ;

// content for program lines
content
    :
        (
            '(' (WS? content)* WS? ')'
        |
            '(' (WS? content)*                  {notifyErrorListeners("Missing closing ')'");}
        |
            '(' (WS? content)* WS? ')' ')'      {notifyErrorListeners("Too many closing ')'");}
        |
            StringLiteral
        |
            placeholder 
        |
            dynamicCast
        |
            lineContinuation (ifStatement)*
        |
           ~(
                '('
            |
                ')'
            |
                '\''
            |
                '"'
            |
                '!'
            |
                InPlaceAdd
            |
                InPlaceSub
            |
                InPlaceMul
            |
                InPlaceDiv
            |
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
            |
                Newline
            )
        )
    ;

// content is allowed to contain line continuations
lineContinuation
    :
        '&' WS? Newline
    ;

// content blocks are build up of content lines
contentLine
    :
        WS? 
        (content)*? 
        ( Newline | lineComment)
    ;

// a placeholder used in content blocks
placeholder
    :
        '$' '{' WS? (expr|logicalExpr) WS? '}'
    ;

// dynamic cast
dynamicCast
    :
        Dynamic_Cast WS? '<' WS? dataType (WS? ',' WS? dataTypeParameter)* WS? '>' WS? '(' (WS? content)+ WS? ')'
    ;

// in-place operators
inPlaceOperationLine
    :
        WS?
        (content WS?)+
        op=('+='|'*='|'-='|'//=')
        WS? (content WS?)+
        ( Newline | lineComment)
    ;

// variable definition, such a variable can be used everywhere in the same scope unit
variableDefinition
    :
        WS? Prefix WS listAssignment WS? Newline
    ;

// the last rule is an line comment
lineComment
    :
        WS? '!' 
        (
            Newline
        |
            ~('$[Ff][Pp]') (placeholder | ~(Newline))* Newline        
        )
    ;

// expressions could be used in if statements or placeholders
expr
    :
        expr WS? op=('*'|'/') WS? expr                      # ExprMulDiv
    |
        expr WS? op=('+'|'-') WS? expr                      # ExprAddSub
    |
        '(' WS? expr WS? ')'                                # ExprParens
    |
        IntegerConstant                                     # ExprConstants
    |
        Identifier WS? '(' WS? expr WS? ')'                 # ExprArraySubscript
    |
        Identifier                                          # ExprVariable
    |
        StringLiteral                                       # ExprString
    ;


// logical expression for if statements
logicalExpr
    :
        logicalExpr WS? And WS? logicalExpr                 #LogicalExprAnd
    |
        logicalExpr WS? Or WS? logicalExpr                  #LogicalExprOr
    |
        Not WS? logicalExpr                                 #LogicalExprNot
    |
        expr WS? op=('=='|'/='|'>'|'<') WS? expr            #LogicalExprCompare
    ;

// token definitions
Equal           :   '==';
NotEqual        :   '/=';
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
Plus            :   '+';
Minus           :   '-';
Star            :   '*';
Slash           :   '/';
Ampersand       :   '&';

// in-place operators
InPlaceAdd      :   '+=';
InPlaceSub      :   '-=';
InPlaceMul      :   '*=';
InPlaceDiv      :   '//=';

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
Elemental       :   [Ee][Ll][Ee][Mm][Ee][Nn][Tt][Aa][Ll] ;
Type            :   [Tt][Yy][Pp][Ee] ;
Class           :   [Cc][Ll][Aa][Ss][Ss] ;
Extends         :   [Ee][Xx][Tt][Ee][Nn][Dd][Ss] ; 
Private         :   [Pp][Rr][Ii][Vv][Aa][Tt][Ee] ;
Public          :   [Pp][Uu][Bb][Ll][Ii][Cc] ;
Sequence        :   [Ss][Ee][Qq][Uu][Ee][Nn][Cc][Ee] ;
Abstract        :   [Aa][Bb][Ss][Tt][Rr][Aa][Cc][Tt] ;
Bind            :   [Bb][Ii][Nn][Dd] ;
Generic         :   [Gg][Ee][Nn][Ee][Rr][Ii][Cc] ;
If              :   [Ii][Ff] ;
Then            :   [Tt][Hh][Ee][Nn] ;
Else            :   [Ee][Ll][Ss][Ee] ;
And             :   '.'[Aa][Nn][Dd]'.' ;
Not             :   '.'[Nn][Oo][Tt]'.' ;
Or              :   '.'[Oo][Rr]'.' ;
Integer         :   [Ii][Nn][Tt][Ee][Gg][Ee][Rr] ;
Real            :   [Rr][Ee][Aa][Ll] ;
Complex         :   [Cc][Oo][Mm][Pp][Ll][Ee][Xx] ; 
Logical         :   [Ll][Oo][Gg][Ii][Cc][Aa][Ll] ;
Character       :   [Cc][Hh][Aa][Rr][Aa][Cc][Tt][Ee][Rr] ;
Kind            :   [Kk][Ii][Nn][Dd] ;
Len             :   [Ll][Ee][Nn] ;
Pointer         :   [Pp][Oo][Ii][Nn][Tt][Ee][Rr] ;

// keywords for fplus intrinsic functions
Dynamic_Cast    :   [Dd][Yy][Nn][Aa][Mm][Ii][Cc]'_'[Cc][Aa][Ss][Tt] ;


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

FloatConstant
    :
        IntegerConstant '.' IntegerConstant?
    ;

StringLiteral
    :
        (
            '"' ( StringEscSequence | ~[\\\r\n"] )* '"'
        |
            '\'' ( StringEscSequence | ~[\\\r\n'] )* '\''
        )
    ;

fragment StringEscSequence
    : 
        '\\' .
    ;

AssignPointer
    :
        '=' '>'
    ;

OperatorOverload
    :
        '(' WS? ('+' | '-' | '*' | '/' | '=') WS?')'
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
