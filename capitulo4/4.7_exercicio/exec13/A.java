class A {
    public static void main(String[] args) {
        String s = "estudando para a certificação";
        s.replace("e", 'a');
        System.out.println(s);
    }
}

/**
A resposta certa é (a). O código não compila pois o método replace
possui duas maneiras de ser invocado: com dois chars ou com duas
Strings. Forampassados uma String e um char,método que não
existe.
 */