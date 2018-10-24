class B{
    void x(int... x) {
        System.out.println(x.length);
    }
}
class A {
    public static void main(String[] args) {
        new B().x(23789,673482);
    }
}

/**
A resposta certa é (c). O código compila e imprime 2.
 */