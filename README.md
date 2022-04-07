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
# **Definovaná gramatika**
- pomocí ANTLR4
- definována v souboru [Grammar.g4](https://github.com/kareldrnec/Gramatika/blob/main/src/main/java/Grammar.g4)
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
- následně byl vygenerován lexer, parser,... z definováné gramatiky pomocí Generate ANTLR Recognizer, při kterém bylo specifikáno, že bude generován i Visitor
- byla následně vytvořena třída [EvalVisitor](https://github.com/kareldrnec/Gramatika/blob/main/src/main/java/output/EvalVisitor.java), ve které byly implementovány funkce kalkulačky z [GrammarBaseVisitor](https://github.com/kareldrnec/Gramatika/blob/main/src/main/java/output/GrammarBaseVisitor.java)
# **Kalkulačka**
- metoda [main](https://github.com/kareldrnec/Gramatika/blob/main/src/main/java/output/Calculator.java) kalkulačky načítá příklady ze souborů s validními a nevalidními daty
## **Validní data**
- validní data jsou obsažena v souboru [valid.txt](https://github.com/kareldrnec/Gramatika/blob/main/src/main/files/valid.txt)
- co jeden řádek, to jeden příklad
## **Nevalidní data**
- nevalidní data jsou obsažena v souboru [invalid.txt](https://github.com/kareldrnec/Gramatika/blob/main/src/main/files/invalid.txt)
- co jeden řádek, to jeden příklad (špatně zapsaný nebo špatná hodnota výrazu)
## FileParser
- soubory jsou načítány pomocí vytvořené třídy [FileParser](https://github.com/kareldrnec/Gramatika/blob/main/src/main/java/output/FileParser.java), ve které pomocí FileReaderu jsou načítány řádky do pole typu String (v kalkulačce se poté iteruje přes prvky tohoto pole)
##
