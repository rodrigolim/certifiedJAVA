cd class B{

}
class A {
    public static void main(String[] args) {
        B b;
        for(int i = 0;i < 10;i++)
            b = new B();
        System.out.println("end!");
    }
}

/**
b) Compila e 10 objetos do tipo B podem ser garbage coletados ao chegar
na linha do System.out.
 */