# **PRK - Popis vlastního jazyka**
## **Číselné soustavy**
- Integer
- Double
## **Výraz**
- výrazem (expression) může být složený výraz nebo číslo z číselné soustavy
## **Závorky**
Oddělovače.
```
Závorka:
(jedna z)
( )
```
## **Operace**
- Aritmetické
### **Aritmetické operace**
- sčítání
- odečítání
- násobení
- dělení
- umocňování
- zbytek po dělení
#### **Sčítání**
- sčítání výrazů
- symbol: +
```
výraz1+výraz2;
```
#### **Odečítání**
- odečítání výrazů
- symbol: -
```
výraz1-výraz2;
```
#### **Násobení**
- násobení výrazů
- symbol: *
```
výraz1*výraz2;
```
#### **Dělení**
- dělení výrazů
- symbol: /
```
výraz1/výraz2;
```
#### **Umocňování**
- umocňování výrazů
- symbol: ^
```
výraz1^výraz2;
```
#### **Zbytek po dělení**
- zbytek po dělení výrazů (modulo)
- symbol: %
```
výraz1%výraz2;
```
## **Funkce**
- Inverzní hodnota
- Faktoriál
- Náhodné číslo
- Maximum
- Minimum
### **Inverzní hodnota**
- inverzní hodnota výrazu
```
inv(výraz);
nebo
inverse(výraz);
```
### **Faktoriál**
- faktoriál výrazu
```
fact(výraz);
nebo
factorial(výraz);
```
### **Náhodné číslo**
- náhodné číslo z intervalu definován minimem a maximem (čísla min a max)
```
rand(min,max);
nebo
random(min,min);
```
### **Maximum**
- vrací větší hodnotu ze dvou čísel
```
max(číslo1,číslo2);
nebo
maximum(číslo1,číslo2);
```
### **Minimum**
- vrací menší hodnotu ze dvou čísel
```
min(číslo1,číslo2);
nebo
minimum(číslo1,číslo2);
```
# Definovaná gramatika
- pomocí ANTLR4
- definována v souboru Grammar.g4
```
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
```
