grammar JavaLexer;

r : class_def+ ;

WS :			[ \t\n\r]		-> skip;
COMMENT:		'/*' .*? '*/'	-> skip;
LINE_COMMENT:	'//' ~[\r\n]*	-> skip;
STUFF : ('=' | '-' | '+' | '*' | '/') -> skip;

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
SEMICOLON : ';';

IDENTIFIER: Letter LetterOrDigit*;
//CONSTRUCTOR: ACCESSMOD? METHODSIG METHODBODY  ;

accessmod: PUBLIC | PRIVATE | PROTECTED;
parameter: datatype IDENTIFIER;
//METHODBODY: LCBRACK RBRACK;

method_sig : IDENTIFIER LBRACK (parameter(',' parameter)*)? RBRACK (THROWS IDENTIFIER(',' IDENTIFIER)*)?;
method_call : ((IDENTIFIER '.')?IDENTIFIER LBRACK IDENTIFIER(',' IDENTIFIER)*) RBRACK SEMICOLON;
method : method_sig LCBRACK (variable | method_call)* RCBRACK;
variable : datatype IDENTIFIER SEMICOLON;
attribute : accessmod? variable;
datatype: INTEGER | DOUBLE | FLOAT | STRING | LONG | SHORT | BYTE | IDENTIFIER;
class_def : accessmod? CLASS IDENTIFIER (EXTENDS IDENTIFIER)? (IMPLEMENTS IDENTIFIER(',' IDENTIFIER)*)? LCBRACK (method | attribute | class_def)* RCBRACK;

//DECIMAL_LITERAL: [+-]? [1-9] [0-9]*;

fragment Digitss
	: [0-9] ([0-9_]* [0-9])?
	;

fragment LetterOrDigit
	: Letter
	| [0-9]
	;

fragment Letter
	: [a-zA-Z$_];