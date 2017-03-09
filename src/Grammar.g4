/*
 a. Minimaal	2	datatypen.
 b. Ondersteuning	voor	variabelen.
 c. Rekenkundig	expressies	(+,-,*,/,%,()	).
 d. Logische	expressies	(<,	<=,	=,	!=,	>=,	>,	or,	and,	not).
 e. Conditional	branching	(denk	aan	bijvoorbeeld	een	if/else-if/else	statement).
 f. Looping	statement(s)	(bijvoorbeeld	while	of	for).
 g. Functies	met	parameters	en	return	type(s).
 h. Ondersteuning	voor	globale	variabelen.
 i. Ondersteuning	voor	het	printen	van	expressies	en	variabelen naar	de	console.
 TODO j. Ondersteuning	voor	het	lezen	van	gebruikersinvoer.
*/

grammar Grammar;

/*   Lexical rules   */
// statements
IF   : 'IF' ;
ELSEIF : 'ELSE IF';
ELSE: 'ELSE';
WHILE: 'WHILE';
PRINT: 'PRINT';
RETURN: 'RETURN';

// class def
END: 'END';
CLASS: 'CLASS';
CLASSNAME: [A-Z][a-z|A-Z]+;

// variable id
ID: [a-z][a-z|A-Z]*;

// datatypes
INT : [0-9]+;
CHAR : [a-z|A-Z]+;
BOOLEAN : 'true'|'false';

// rek operators
MULT  : '*' ;
DIV   : '/' ;
PLUS  : '+' ;
MINUS : '-' ;
MOD : '%';

// logische operators
LST : '<';
LSTEQL : '<=';
EQL : '==';
NEQL : '!=';
GRTEQL : '>=';
GRT : '>';
OR : 'OR';
AND : 'AND';
NOT : 'NOT';

// skipped
COMMENT: '//' ~( '\r' | '\n' )* -> skip;
WS: [\t\r\n ]+ -> skip;


/*   Grammar rules   */
// class definitie
prog: CLASS CLASSNAME '{' (variable)* (method)* '}' END;

// ondersteuning voor variabelen
variable: normVariable | arrayVariable;

// standaard variabelen
normVariable: dataType ID (normVariableDeclaration)? ';';
normVariableDeclaration: '=' normVariableInitializer;
normVariableInitializer: expr | CHAR;

// array variabelen
arrayVariable: dataType '[]' ID (arrayDeclaration)? ';';
arrayDeclaration: '=' arrayInitializer;
arrayInitializer: 'new' dataType '[' INT ']' | '{' INT (',' INT)* '}';

// ondersteuning voor methoden
parameter: dataType ID;
parameterList: parameter (',' parameter)*;
modifier: 'PUBLIC' | 'PRIVATE';
returnType: dataType | 'VOID';
method: modifier returnType ID '(' parameterList? ')' '{' content '}';

// data types
dataType: 'INT'
        | 'CHAR'
        | 'BOOLEAN'
        ;

// expressies
expr: rekExpr
//    | addExpr
    | BOOLEAN
    | INT
    | ID;


//addExpr: left=addExpr() right=addExpr   #opExpr // addition
//        | INT                                       #atomExpr
//        | ID                                        #idExpr
//        | '(' addExpr ')'                           #parenExpr
//        ;

// 1.) rekenkundige expressies
rekExpr: left=rekExpr op=(PLUS | MINUS | MULT | DIV | MOD) right=rekExpr    #opExpr
       | INT                                                                #atomExpr
       | ID                                                                 #idExpr
       | '(' rekExpr ')'                                                    #parenExpr
       ;

// 2.) logische expressies
logExpr: left=logExpr op=(LST | LSTEQL | EQL | NEQL | GRTEQL | GRT | OR | AND | NOT) right=logExpr  #logaExpr
       | INT                                                                                        #logAtomExpr
       | ID                                                                                         #logIdExpr
       | '(' logExpr ')'                                                                            #logparenExpr
       ;

// methoden inhoud
content: (statement
       | ID normVariableDeclaration ';'
       | ID arrayDeclaration ';')* returnStatement
       ;

// ondersteuning voor verschillende soorten statements
statement: ifStatement | whileStatement | printStatement;

// ondersteuning voor de content van een bepaalde statement (bijv. if of de while)
contstatement: (statement
             | ID normVariableDeclaration ';'
             | ID arrayDeclaration ';')*;

// if statement
ifStatement
    :   IF '(' condition ')' '{' contstatement '}'
        (ELSEIF '(' condition ')' '{' contstatement '}')*
        (ELSE '{' contstatement '}')?
    ;

// while statement
whileStatement
	:	WHILE '(' condition ')' '{' contstatement '}'
	;

// print statement
printStatement: PRINT expr ';';

// return statement
returnStatement: RETURN expr ';';

// statement conditie
condition: logExpr | BOOLEAN;
