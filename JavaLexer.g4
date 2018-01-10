grammar JavaLexer;

r : class_def+ ;

WS :			[ \t\n\r]		-> skip;
COMMENT:		'/*' .*? '*/'	-> skip;
LINE_COMMENT:	'//' ~[\r\n]*	-> skip;
STUFF : ( '-' | '+' | '*' | '/') -> skip;

// Keywords
CLASS : 'class';
PUBLIC : 'public';
PRIVATE : 'private';
PROTECTED : 'protected';
ABSTRACT : 'abstract';
STATIC : 'static';
VOID : 'void';
IMPLEMENTS : 'implements';
EXTENDS : 'extends';
INTERFACE : 'interface';
ENUM : 'enum';
THROWS : 'throws';
THIS : 'this';
RETURN : 'return';
TRUE : 'true';
FALSE : 'false';
NEW : 'new';

// Loops
FOR : 'for';
WHILE : 'while';

// Data types
INTEGER : 'int';
DOUBLE : 'double';
FLOAT : 'float';
STRING : 'String';
LONG : 'long';
SHORT : 'short';
BYTE : 'byte';

LBRACK : '(';
RBRACK : ')';
LCBRACK : '{';
RCBRACK : '}';
LSQBRACK : '[';
RSQBRACK : ']';
LPBRACK : '<';
RPBRACK : '>';
SEMICOLON : ';';
DOT : '.';

IDENTIFIER: Letter LetterOrDigit*;
STRING_CONST : '"' .*? '"';
//CONSTRUCTOR: ACCESSMOD? METHODSIG METHODBODY  ;

accessmod: PUBLIC | PRIVATE | PROTECTED;
parameter: datatype (LSQBRACK RSQBRACK)? IDENTIFIER (LSQBRACK RSQBRACK)?;
//METHODBODY: LCBRACK RBRACK;

constructor : accessmod? STATIC? IDENTIFIER LBRACK (parameter(',' parameter)*)? RBRACK (THROWS IDENTIFIER(',' IDENTIFIER)*)? LCBRACK scope_body* RCBRACK;
method_sig : accessmod? (STATIC | ABSTRACT)? (datatype | VOID) IDENTIFIER LBRACK (parameter(',' parameter)*)? RBRACK (THROWS IDENTIFIER(',' IDENTIFIER)*)?;
method_call : (IDENTIFIER DOT)?IDENTIFIER (LPBRACK datatype? RPBRACK)? LBRACK (method_call_param)? RBRACK;
method_call_param : (method_call | STRING_CONST | IDENTIFIER | Digitss) (('+' | '-' | '*' | '/') method_call_param)? (',' (STRING_CONST | IDENTIFIER | Digitss))* ;
method : method_sig (LCBRACK scope_body* RCBRACK | SEMICOLON);
scope : LCBRACK scope_body*? RCBRACK;
expression : (RETURN (THIS DOT)? | THIS DOT | datatype)? IDENTIFIER ((DOT | (( '+' | '-' | '*' | '/' )? '='? (LBRACK IDENTIFIER RBRACK)?) LBRACK* NEW? (method_call | IDENTIFIER | Digitss+))+ | '++' | '--')? RBRACK*;
condition : LBRACK* ((IDENTIFIER? ('<=' | '>=' | '<' | '>' | '==' | '&' | '|' ) (Digitss | IDENTIFIER | method_call('.' (method_call | IDENTIFIER))*)) | TRUE | FALSE) RBRACK*? condition?;
variable : datatype IDENTIFIER;
attribute : accessmod? variable SEMICOLON;
datatype: INTEGER | DOUBLE | FLOAT | STRING | LONG | SHORT | BYTE | IDENTIFIER (LPBRACK datatype RPBRACK)?;
scope_body : expression SEMICOLON| method_call SEMICOLON | for_loop | while_loop | scope;
for_loop : FOR LBRACK expression? SEMICOLON condition SEMICOLON expression RBRACK (LCBRACK scope_body* RCBRACK) | expression SEMICOLON;
while_loop : WHILE LBRACK expression? condition RBRACK (SEMICOLON | LCBRACK scope_body* RCBRACK | expression SEMICOLON);
class_def : accessmod? ABSTRACT? CLASS IDENTIFIER (EXTENDS IDENTIFIER)? (IMPLEMENTS IDENTIFIER(',' IDENTIFIER)*)? LCBRACK (constructor | method | attribute | class_def)* RCBRACK;
//DECIMAL_LITERAL: [+-]? [1-9] [0-9]*;

Digitss
	: [0-9] ([0-9_]* [0-9])?
	;

LetterOrDigit
	: Letter
	| [0-9]
	;

Letter
	: [a-zA-Z$_];