class A {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("guilherme");
        System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
        System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));
    }
}

//a) O código imprime 13 e -2.