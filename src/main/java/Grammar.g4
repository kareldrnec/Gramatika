grammar Grammar;

program: print*;
print: 'pocitej' '(' expression ')' ';';
//print: expression ';';
//parents: '(' expression ')';
//expression: expression (ADD|MINUS|MUL|DIV|MOD) expression | VARIABLE | OPRAND | parents;
expression:'(' expression ')'               # Parents // zavorky
          | expression MUL expression       # MUL   // nasobeni
          | expression DIV expression       # DIV   // deleni
          | expression ADD expression       # ADD   // scitani
          | expression MINUS expression     # MINUS // odecitani
          | FACT                            # FACT  // faktorial
          | POW                             # POW   // mocnina
          | RAND                            # RAND  // nahodne cislo rand(min, max)
          | NUMBER                          # NUMBER
          ;

NUMBER: INT | DOUBLE;
INT: [0-9]+('_'[0-9]+)* | '0'('x'|'X')[0-9a-fA-F]+;
DOUBLE: [0-9]+('_'[0-9]+)* '.' [0-9]+('_'[0-9]+)*;

ADD: '+';
MINUS: '-';
MUL: '*';
DIV: '/';

FACT: 'fact' '(' INT ')';
POW: 'pow' '(' NUMBER ')';
RAND: 'rand' '(' INT ',' INT ')';

NEWLINE: [\t\r\n] -> skip;
WS: ' ' -> skip;