package b;
import a.A;
static import a.A.*;
class B{
    void m() {
        A a = new A();
        a.run(VALUE);
    }
}

//a) B não compila: erro na linha 3.