class B{
    void x(int... x) {
        System.out.println(x.length);
    }
}
class A {
    public static void main(String[] args) {
        new B().x(new int[]{23789,673482});
    }
}

/**
A resposta certa é (e). O código compila e imprime 2.
 */