package b;
import static a.A.*;
class B{
    void m() {
        A a = new A();
        a.run(VALUE);
    }
}

//b) B não compila: erro na linha 5.