grammar Grammar;

program: print*;
//print: 'pocitej' '(' expression ')' ';';
print: expression ';';
//parents: '(' expression ')';
//expression: expression (ADD|MINUS|MUL|DIV|MOD) expression | VARIABLE | OPRAND | parents;
expression:'(' expression ')'               # Parents // zavorky
          | expression POW expression       # POW
          | expression MUL expression       # MUL   // nasobeni
          | expression DIV expression       # DIV   // deleni
          | expression ADD expression       # ADD   // scitani
          | expression MINUS expression     # MINUS // odecitani
          | INV '(' expression ')'          # INV
          | FACT '(' expression ')'         # FACT  // faktorial
          | RAND '(' NUMBER ',' NUMBER ')'  # RAND  // nahodne cislo rand(min, max)
          | MAX '(' NUMBER ',' NUMBER ')'   # MAX
          | MIN '(' NUMBER ',' NUMBER ')'   # MIN
          | NUMBER                          # NUMBER
          ;

FACT: 'fact' | 'factorial';
RAND: 'rand' | 'random';
MAX: 'max' | 'maximum';
MIN: 'min' | 'minimum';
INV: 'inv' | 'inverse';

NUMBER: INT | DOUBLE;
INT: [0-9]+('_'[0-9]+)*;
DOUBLE: [0-9]+('_'[0-9]+)* '.' [0-9]+('_'[0-9]+)*;

ADD: '+';
MINUS: '-';
MUL: '*';
POW: '^';
DIV: '/';


NEWLINE: [\t\r\n] -> skip;
WS: ' ' -> skip;