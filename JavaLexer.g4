grammar JavaLexer;

r : .*? CLASS IDENTIFIER (EXTENDS IDENTIFIER)? (IMPLEMENTS IDENTIFIER(',' IDENTIFIER)*)? LCBRACK  .*;

WS :			[ \t\n\r]		-> skip;
COMMENT:		'/*' .*? '*/'	-> skip;
LINE_COMMENT:	'//' ~[\r\n]*	-> skip;
STUFF : ('.' | ',' | ';' | '=' | '-' | '+' | '*' | '/') -> skip;

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

IDENTIFIER: Letter LetterOrDigit*;
CONSTRUCTOR: ACCESSMOD? METHODSIG METHODBODY  ;

ACCESSMOD: PUBLIC | PRIVATE | PROTECTED;
PARAMETER: DATATYPE IDENTIFIER;
DATATYPE: INTEGER | DOUBLE | FLOAT | STRING | LONG | SHORT | BYTE | IDENTIFIER;
METHODSIG: IDENTIFIER LBRACK (PARAMETER(',' PARAMETER)*)? RBRACK (THROWS IDENTIFIER(',' IDENTIFIER)*)?;
METHODBODY: LCBRACK  RBRACK;

//DECIMAL_LITERAL: [+-]? [1-9] [0-9]*;

fragment Digits
	: [0-9] ([0-9_]* [0-9])?
	;

fragment LetterOrDigit
	: Letter
	| [0-9]
	;

fragment Letter
	: [a-zA-Z$_];