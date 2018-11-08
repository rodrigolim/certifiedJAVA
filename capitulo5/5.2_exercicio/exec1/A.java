class A {
    public static void main(String[] args) {
        String result = ("division: " + 15) / 0.0;
        System.out.println(result);
    }
}

/**
 A resposta certa é (a). Não compila pois o resultado do parenteses é
uma String que não possui o operador de divisão.
 */