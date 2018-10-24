class A {
    public static void main(String[] args) {
        int val = 10;
        int div = 4;
        double res = val / div;
        System.out.println(val + div +
        "...");
        System.out.println(res + " = result");
    }
}

/**
A resposta certa é (a). O código não compila pois o método replace
possui duas maneiras de ser invocado: com dois chars ou com duas
Strings. Forampassados uma String e um char,método que não
existe.
 */