class A {
    public static void main(String[] args) {
        System.out.println(((!(true==false))==true ? 1 : 0)==0);
    }
5 }

/**
2. A resposta certa é (b). true==false é false. O inverso disso é
true. Comparando com true, é true. Portanto, o operador ternário
devolve 1 que é diferente de 0, imprimindo false.
 */