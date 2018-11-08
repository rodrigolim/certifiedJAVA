class A {
    public static void main(String[] args) {
        String result = "results: " + 15 / 0.0;
        System.out.println(result);
    }
}

/**
A resposta certa é (c). O código compila e imprime positivo infinito. A
precedência de operadores é primeiro a divisão, por isso compila.
 */