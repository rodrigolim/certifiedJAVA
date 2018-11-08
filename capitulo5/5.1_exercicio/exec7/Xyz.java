class Xyz {
    public static void main(String[] args) {
        int y;
        for(int x = 0; x<10; ++x) {
            y = x % 5 + 2;
        }
        System.out.println(y);
    }
}


/**
A resposta certa é (b). O código não compila na linha 7. O compilador
não tem certeza se a variável y vai ser iniciada sempre. Como a declaração
é feita e o único valor atribuído é dentro do for, o compilador
não tem certeza se o for vai ser executado mesmo.

 */