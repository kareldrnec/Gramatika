# **PRK - Popis vlastního jazyka**
## **Číselné soustavy**
- Integer
- Double
## **Výraz**
- výrazem (expression) může být složený výraz nebo číslo z číselné soustavy
- celkový výraz musí být ukončen pomocí ;
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
# **Validní/nevalidní data**
- definovány v souborech (.txt) ve složce [files](https://github.com/kareldrnec/Gramatika/tree/main/src/main/files)
## **Validní data**
```
fact(9);
5;
9.5;
inv(5);
inv(9.5);
5-inv(2);
1+9-20*(20-4);
rand(2,10);
rand(2.3,10.9);
fact(9);
fact(12);
1+9*101+120;
1-9*(12+5-(5*6));
1/5;
1.2/3;
1.2/0.5;
min(3,3.2);
max(3,3.2);
max(3,9.5)*2;
5-max(2,4);
5-min(2,4);
inv(5)+25/5;
fact(7)+65*(2-9);
(((5*6)+max(5,6))*2);
20%7;
14+64*95%9;
```
## **Nevalidní data**
```
54
12-+5;
14+-9;
inv(-5);
14+(;
14+9*((-50);
rand(4+5,5);
fact(5*6+3)+;
9*%5;
9%-2;
rnd(2,4);
9/0;
fact(10+3);
fact(4.5);
min(6+5,50);
min6,5);
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
# Dodatky
## **FileParser**
- soubory jsou načítány pomocí vytvořené třídy [FileParser](https://github.com/kareldrnec/Gramatika/blob/main/src/main/java/output/FileParser.java), ve které pomocí FileReaderu jsou načítány řádky do pole typu String (v kalkulačce se poté iteruje přes prvky tohoto pole)
## **Ošetření chyb**
- Ošetření chyb při analýzách (lexer, parser)
- Ošetření chyb při výpočtu
### **Ošetření chyb při analýzách (lexer, parser)**
- pro ošetření chyb (lexer/parser) byla vytvořena třída [GrammarErrorListener](https://github.com/kareldrnec/Gramatika/blob/main/src/main/java/output/GrammarErrorListener.java), která rozšiřuje třídu BaseErrorListener
- obsahuje navíc privátní proměnné error, errorMsg a modifikuje metodu syntaxError
- do chybové zprávy je uloženo, ve které části (lexer/parser) došlo k chybě a obsah chyby
- v [main](https://github.com/kareldrnec/Gramatika/blob/main/src/main/java/output/Calculator.java) je poté tato třída přidána jako ErrorListener pro lexer a parser
- při výpisu je ještě přidáno číslo řádku v souboru, ve kterém se tato chyba vyskytla
### **Ošetření chyb při výpočtu**
- při vyhodnocování výrazu může dojít k výpočetní chybě (dělení nulou, příliš velké číslo pro výpočet faktoriálu, při generování náhodného čísla byla zadaní minimální hodnota větší než maximální)
- v těchto případech je vyhozena chyba IllegalArgumentException v příslušnou zprávou
- při výpisu je ještě přidáno číslo řádku v souboru, ve kterém se tato chyba vyskytla


# **Kalkulačka**
- kalkulačka se používá pomocí vytvořeného jar souboru z příkazové řádky
- soubor Calculator.jar se nachází ve složce [Calculator](https://github.com/kareldrnec/Gramatika/tree/main/Calculator)
- ve složce [Calculator](https://github.com/kareldrnec/Gramatika/tree/main/Calculator) se nachází i soubor s validními daty [valid.txt](https://github.com/kareldrnec/Gramatika/blob/main/Calculator/valid.txt) a soubor s nevalidními daty [invalid.txt](https://github.com/kareldrnec/Gramatika/blob/main/Calculator/invalid.txt)
## **Validní data**
- co jeden řádek, to jeden příklad
## **Nevalidní data**
- co jeden řádek, to jeden příklad (špatně zapsaný nebo špatná hodnota výrazu)
## **Spuštění kalkulačky**
- stažení souboru Calculator.jar a souborů s daty (valid.txt a invalid.txt)
- spuštění kalkulačky pomocí příkazů
```
java -jar Calculator.jar volba
```
### **Volba**
- volba může být "-f" nebo "-file" pro název vstupního souboru
- následuje název souboru
```
java -jar Calculator.jar -f valid.txt
nebo
java -jar Calculator.jar -file valid.txt
```
- dále volba může být "-h" nebo "-help" pro zobrazení nápovědy
```
java -jar Calculator.jar -h
nebo
java -jar Calculator.jar -help
```
