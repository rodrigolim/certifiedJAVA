class A {
    public static void main(String[] args) {
        String empty = null;
        String full = "Welcome " + empty;
        System.out.println(full);
    }
}

/**
A resposta certa é (e). Compila e imprime Welcome null
*/