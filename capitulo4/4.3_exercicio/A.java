class B{
    int c;
    void c(int c) {
        c = c;
    }
}

class A {
    public static void main(String[] args) {
       B b = new B();
       b.c = 10;
       System.out.println(b.c);
       b.c(30);
       System.out.println(b.c);
    }
}

/**
Aresposta certa é (d). Não existe conflito de nomes entre variávelmembro
emétodo ou variávelmembro e variável local. Ao invocar ométodo
c, por causa do shadowing da variável c, não acessamos a variável
membro, sem alterá-la. O resultado é a impressão dos valores 10 e 10
novamente.
 */