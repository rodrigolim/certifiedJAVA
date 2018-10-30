# certifiedJAVA

Estudos para certificação JAVA baseados no livro: 
** Java SE 8  Programmer I ** 
* O guia para sua certificação Oracle Certified Associate *


## Todos os tipos primitivos do Java já estão definidos e não é possível criar novos tipos primitivos. São oito os tipos primitivos do Java 

```
 * byte     = 1 byte (8 bits, de -128 a 127);
 * short    = 2 bytes (16 bits, de –32.768 a 32.767); 
 * char     = 2 bytes (só positivo), (16 bits, de 0 a 65.535);
 * int      = 4 bytes (32 bits, de –2.147.483.648 a 2.147.483.647);
 * long     = 8 bytes (64 bits, de –9.223.372.036.854.775.808 a 9.223.372.036.854.775.807).
 * float    = 4 bytes (32 bits, de +/–1.4 * 10 ^45 a +/–3.4028235 * 10 ^38);
 * double   = 8 bytes (64 bits, de +/–4.9 * 10 ^324 a +/–1.7976931348623157 * 10 ^308).
 * boolean  = true or false;
```
### OBS: Dado o número de bits N do tipo primitivo inteiro, para saber os valores que ele aceita usamos a seguinte conta:

```
   * -2^(n-1) a 2^(n-1) -1
   * A única exceção é o tipo char, por ser apenas positivo:  0 a 2^(16) -1
```
