class B {
    void x() {
        System.out.println("empty");
    }
    void x(String... args) {
        System.out.println(args.length);
    }
}
class C {
    void x(String... args) {
        System.out.println(args.length);
    }
    void x() {
        System.out.println("empty");
    }
}
class A {
    public static void main(String[] args) {
        new B().x();
        new C().x();
    }
}

/**
A resposta certa é (b). O código compila e devido à regra de sempre
invocar omais específico, ele sempre invoca ométodo sem argumentos.
Portanto, o resultado é vazio/vazio. Lembre-se que em Java a ordem de
definição de métodos não importa para a invocação. Já a ordem das
variáveis pode importar, caso uma dependa da outra.
 */