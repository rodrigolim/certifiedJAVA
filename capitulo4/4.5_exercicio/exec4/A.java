class B{
    void x(Object... x) {
        System.out.println(x.length);
    }
}
class A {
    public static void main(String[] args) {
        new B().x(new Object[]{23789,673482});
    }
}

/**
A resposta certa é (e). O código compila e imprime 2. Esse é o caso
absurdo onde o array é tantoum Object quantoumarray de Object.
Por padrão o Java tratará como um array de Object.
 */