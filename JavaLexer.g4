grammar JavaLexer;

r : (interface_def | class_def)* ;

COMMENT:		'/*' .*? '*/'	-> skip;
LINE_COMMENT:	'//' ~[\r\n]*	-> skip;
ANNOTATION:		'@' ~[\r\n]*	-> skip;
IMPORTS:		IMPORT .*? SEMICOLON ->skip;
STUFF : 		PACKAGE .*? SEMICOLON -> skip;

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
IMPORT : 'import';
ENUM : 'enum';
THROWS : 'throws';
THIS : 'this';
RETURN : 'return';
TRUE : 'true';
FALSE : 'false';
NEW : 'new';
PACKAGE : 'package';
FINAL : 'final';
IF : 'if';
ELSE : 'else';
NULL : 'null';
INSTANCEOF : 'instanceof';
TRY : 'try';
CATCH : 'catch';
FINALLY : 'finally';


// Loops
FOR : 'for';
WHILE : 'while';
DO : 'do';

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
SWITCH : 'switch';
CASE : 'case';
DEFAULT : 'default';
BREAK : 'break';
THROW :'throw';

IDENTIFIER: '_'* Letter ('_' | LetterOrDigit)*;
STRING_CONST : '"' (~["\\\r\n] | EscapeSequence)* '"';// '"' (.*? | '\\"') '"';
WS :			[ \t\n\r]		-> skip;
fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

HexDigits: '0x' HexDigit+;


//CONSTRUCTOR: ACCESSMOD? METHODSIG METHODBODY  ;

accessmod: PUBLIC | PRIVATE | PROTECTED;
parameter: datatype (LSQBRACK RSQBRACK)? IDENTIFIER (LSQBRACK RSQBRACK)?;
//METHODBODY: LCBRACK RBRACK;

constructor : accessmod? STATIC? class_name LBRACK (parameter(',' parameter)*)? RBRACK (THROWS IDENTIFIER(',' IDENTIFIER)*)? scope;
method_sig : accessmod? (STATIC | ABSTRACT)? FINAL? (datatype | VOID) method_name (THROWS IDENTIFIER)? LBRACK (parameter(',' parameter)*)? RBRACK (THROWS IDENTIFIER(',' IDENTIFIER)*)?;
method_call : (THIS DOT)? (class_name DOT)* method_name (LPBRACK datatype? RPBRACK)? (LBRACK | LSQBRACK) (method_call_param(',' method_call_param)*)? (RBRACK | RSQBRACK);
method_call_param : cast? (NEW? method_call (DOT method_call)* | THIS | STRING_CONST | ((IDENTIFIER DOT)+ | THIS DOT)? IDENTIFIER (DOT CLASS)? | Digits | TRUE | FALSE) (math_op (STRING_CONST | IDENTIFIER | Digits | TRUE | FALSE | method_call (DOT method_call)* ))* ;
cast : LBRACK IDENTIFIER(DOT IDENTIFIER)* generic_type_name? RBRACK;
method : method_sig (LCBRACK scope_body* RCBRACK | SEMICOLON);
scope : LCBRACK scope_body*? RCBRACK;
expression : (RETURN? LBRACK*? (THIS DOT)? ((IDENTIFIER DOT)* IDENTIFIER (LSQBRACK IDENTIFIER RSQBRACK)? '=')? (STRING_CONST
							| datatype? (THIS DOT)? IDENTIFIER (DOT IDENTIFIER)* ('++' | '--')?
							| TRUE
							| FALSE
							| LBRACK* cast? THROW? (IDENTIFIER (DOT IDENTIFIER)*)? RBRACK* DOT? NEW? method_call (DOT method_call)*) RBRACK* LBRACK* ((DOT
								| IDENTIFIER
								| STRING_CONST
								| ((math_op | '=' )? (LBRACK IDENTIFIER RBRACK)?) LBRACK* NEW? (method_call (DOT method_call)* math_op? (method_call (DOT method_call)*)?
								| Digits+))+)? math_op?)+ RBRACK*;
condition : (LBRACK*?
	(
		('!'? LBRACK*?
			(method_call(DOT method_call)* | IDENTIFIER | Digits) RBRACK*? comp_op? LBRACK* '!'? LBRACK* math_op?
				(math_op?
					(NULL | HexDigits | Digits | IDENTIFIER (DOT IDENTIFIER)* | (IDENTIFIER DOT)* method_call(DOT (method_call | IDENTIFIER))* RBRACK*)
				)*
			) | TRUE | FALSE
		) RBRACK*?
	)+ (comp_op condition)*;
/*condition: (
			(LBRACK condition RBRACK)
			| ((IDENTIFIER DOT)* IDENTIFIER (LSQBRACK (IDENTIFIER DOT)* IDENTIFIER RSQBRACK)? | Digits | HexDigits | method_call(DOT method_call)*) (comp_op | math_op) math_op? ((IDENTIFIER DOT)* IDENTIFIER | Digits | HexDigits | method_call(DOT method_call)*)) comp_op ((IDENTIFIER DOT)* IDENTIFIER | NULL | HexDigits | Digits);
			*/
if_cond : IF condition (scope | scope_body) (ELSE (if_cond | scope | scope_body))?;
variable_def : datatype IDENTIFIER var_assign? (',' IDENTIFIER var_assign?)* ;
var_assign : '=' LCBRACK? (expression | STRING_CONST | Digits | NULL) (',' (expression | STRING_CONST | HexDigits | Digits | NULL))* RCBRACK?;
attribute : accessmod? STATIC? FINAL? variable_def SEMICOLON;
datatype: (INTEGER
		| DOUBLE
		| FLOAT
		| STRING
		| LONG
		| SHORT
		| BYTE
		| generic_type_name IDENTIFIER?
		| IDENTIFIER(DOT IDENTIFIER)* generic_type_name?) (LSQBRACK RSQBRACK)?;
scope_body : if_cond
		| try_block
		| switch_block
		| for_loop
		| for_each_loop
		| do_while_loop
		| while_loop
		| expression SEMICOLON
		| method_call (DOT method_call)* SEMICOLON
		| scope;
for_loop : FOR LBRACK expression? SEMICOLON condition SEMICOLON expression RBRACK (LCBRACK scope_body* RCBRACK) | expression SEMICOLON;
for_each_loop : FOR LBRACK variable_def ':' (method_call | IDENTIFIER) RBRACK (SEMICOLON | LCBRACK scope_body* RCBRACK | expression SEMICOLON);
while_loop : WHILE LBRACK condition RBRACK (SEMICOLON | LCBRACK scope_body* RCBRACK | expression SEMICOLON);
do_while_loop : DO scope WHILE LBRACK condition RBRACK SEMICOLON;
class_def : accessmod? ABSTRACT? STATIC? FINAL? CLASS class_name (EXTENDS class_name)? (IMPLEMENTS interface_name(',' interface_name)*)? LCBRACK (static_block | constructor | method | attribute | class_def)* RCBRACK;
interface_def : accessmod? INTERFACE interface_name  (EXTENDS class_name)? LCBRACK (method_sig SEMICOLON)* RCBRACK;
class_name : IDENTIFIER generic_type_name?;
interface_name : IDENTIFIER generic_type_name?;
static_block : STATIC LCBRACK (attribute | scope_body)* RCBRACK;
try_block : TRY scope (CATCH LBRACK datatype ('|' datatype)* IDENTIFIER RBRACK scope)+ (FINALLY scope)? ;
switch_block : SWITCH LBRACK expression RBRACK switch_scope;
switch_scope : LCBRACK case_block* RCBRACK;
case_block: (DEFAULT | CASE ((IDENTIFIER DOT)* IDENTIFIER | STRING_CONST | Digits | HexDigits))  ':' scope_body*? (BREAK SEMICOLON)?;
method_name : IDENTIFIER | STRING;
generic_type_name : LPBRACK ('?' EXTENDS)? IDENTIFIER (DOT IDENTIFIER)* RPBRACK;
comp_op : '<='
		| '>='
		| '<'
		| '>'
		| '=='
		| '!='
		| '&'
		| '|'
		| '~'
		| '^'
		| '&&'
		| '||'
		| INSTANCEOF;
math_op : '+'
		| '-'
		| '*'
		| '/'
		| '|'
		| '&'
		| '^'
		| '~';
//DECIMAL_LITERAL: [+-]? [1-9] [0-9]*;

Digits
	: [0-9] ([0-9_]* [0-9])?
	;

LetterOrDigit
	: Letter
	| [0-9]
	;

Letter
	: [a-zA-Z$_];