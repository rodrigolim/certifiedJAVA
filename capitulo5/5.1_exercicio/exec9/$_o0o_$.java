class $_o0o_$ {
    public static void main(String[] args) {
        int $$ = 5;
        int __ = $$++;
        if (__ < ++$$ || __-- > $$)
            System.out.print("A");

        System.out.print($$);
        System.out.print(__);
    }
}

/**
A resposta certa é (e). Compila, roda e imprime A75. Cuidado ao compilar
e rodar pois alguns caracteres podem precisar ser escapados pelo
seu shell ou bash (não cobrado na prova).

 */