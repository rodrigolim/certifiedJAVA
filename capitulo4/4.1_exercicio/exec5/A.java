class A {
    public static void main(String[] args) {
        boolean[] array = new boolean[300];
        System.out.println(array[3]);
    }
}

/**
A resposta certa é (b). Imprime false pois um array de tipos primitivos
após a inicialização tem seus valores com o valor padrão do tipo.
Para numéricos é 0, para boolean é false e para referências é null.
 */