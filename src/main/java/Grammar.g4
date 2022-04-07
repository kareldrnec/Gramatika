grammar Grammar;

program: print*;

print: expression ';';

expression:'(' expression ')'               # Parents
          | expression POW expression       # POW
          | expression MUL expression       # MUL
          | expression DIV expression       # DIV
          | expression MOD expression       # MOD
          | expression ADD expression       # ADD
          | expression MINUS expression     # MINUS
          | INV '(' expression ')'          # INV
          | FACT '(' expression ')'         # FACT
          | RAND '(' NUMBER ',' NUMBER ')'  # RAND
          | MAX '(' NUMBER ',' NUMBER ')'   # MAX
          | MIN '(' NUMBER ',' NUMBER ')'   # MIN
          | NUMBER                          # NUMBER
          ;

POW: '^';
MUL: '*';
MOD: '%';
DIV: '/';
ADD: '+';
MINUS: '-';

INV: 'inv' | 'inverse';
FACT: 'fact' | 'factorial';
RAND: 'rand' | 'random';
MAX: 'max' | 'maximum';
MIN: 'min' | 'minimum';

NUMBER: INT | DOUBLE;
INT: [0-9]+([0-9]+)*;
DOUBLE: [0-9]+([0-9]+)* '.' [0-9]+([0-9]+)*;

NEWLINE: [\t\r\n] -> skip;
WS: ' ' -> skip;