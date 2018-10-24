class A {
    String empty;
    public static void main(String[] args) {
        String full = "Welcome " + empty;
        System.out.println(full);
    }
}

/**
Aresposta certa é (b). Não compila por outromotivo: a variável vazio
não é estática.
 */