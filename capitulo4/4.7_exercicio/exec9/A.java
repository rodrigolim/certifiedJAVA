class A {
    public static void main(String[] args) {
        String s = null;
        String s2 = new String(s);
        System.out.println(s2);
    }
}

/**
A resposta certa é (d). Dá NullPointerException ao tentar criar a
segunda String.
 */