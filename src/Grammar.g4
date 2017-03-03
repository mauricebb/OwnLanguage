/*
 a. Minimaal	2	datatypen.
 b. Ondersteuning	voor	variabelen.
 c. Rekenkundig	expressies	(+,-,*,/,%,()	).
 d. Logische	expressies	(<,	<=,	=,	!=,	>=,	>,	or,	and,	not).
 e. Conditional	branching	(denk	aan	bijvoorbeeld	een	if/else-if/else	statement).
 TODO f. Looping	statement(s)	(bijvoorbeeld	while	of	for).
 g. Functies	met	parameters	en	return	type(s).
 TODO ?? h. Ondersteuning	voor	globale	variabelen.
 TODO i. Ondersteuning	voor	het	printen	van	expressies	en	variabelen naar	de	console.
 TODO j. Ondersteuning	voor	het	lezen	van	gebruikersinvoer.
*/

grammar Grammar;

// class definitie
prog: 'CLASS' CLASSNAME '{' (NEWLINE)* (variable NEWLINE)* (NEWLINE)* (method NEWLINE)* (NEWLINE)* '}END' | (NEWLINE)*;

// ondersteuning voor variabelen
variable: normVariable | arrayVariable;

// standaard variabelen
normVariable: dataType NAME (normVariableDeclaration)? ';';
normVariableDeclaration: '=' normVariableInitializer;
normVariableInitializer: expr | INT | CHAR;

// array variabelen
arrayVariable: dataType '[]' NAME (arrayDeclaration)? ';';
arrayDeclaration: '=' arrayInitializer;
arrayInitializer: 'new' dataType | '{' INT (',' INT)* '}';

// ondersteuning voor methoden
parameter: dataType NAME;
parameterList: parameter (',' parameter)*;
modifier: 'PUBLIC' | 'PRIVATE';
returnType: dataType | 'VOID';
method: modifier returnType NAME '(' parameterList ')' '{' (content | NEWLINE)*'}';

// data types
dataType: 'INT'
        | 'CHAR'
        ;

// expressies
expr: rekExpr | addExpr | logExpr;

// 1.) rekenkundige expressies
// Addition
addExpr: addExpr('+'|'-') addExpr
        | INT
        | '(' addExpr ')'
        ;

// Multiplication
rekExpr: rekExpr('*'|'/'|'%')rekExpr
       | INT
       | '(' rekExpr ')'
       ;

// 2.) logische expressies
logExpr: logExpr('<'|'<='|'=='|'!='|'>='|'>'|'OR'|'AND'|'NOT')logExpr
       | INT
       | '(' logExpr ')'
       ;

// Content o
content: (statement)* (addExpr)* ';' (NEWLINE)*;

statement: ifStatement | whileStatement;

ifStatement
    :   'IF' '(' ifCondition ')' '{' expr '}'
        ('ELSE IF' '(' ifCondition ')' '{' expr '}')*
        ('ELSE' '{' expr '}')?
    ;

whileStatement
	:	'WHILE' '(' condition ')' '{' statement | (NEWLINE)* '}'
	;

ifCondition: expr | BOOLEAN | VAR;
condition: logExpr | BOOLEAN;



CLASSNAME: [A-Z][a-z|A-Z]+;
BOOLEAN : 'true'|'false';
NAME: [a-z][a-z|A-Z]*;
NEWLINE : [\r\n]+;
RETURN : 'return';

INT : [0-9]+;
CHAR : [a-z|A-Z]+;


VAR : [a-z]+;

WS : ' ' -> skip;