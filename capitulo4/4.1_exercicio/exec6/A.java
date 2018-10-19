class A {
    public static void main(String[] args) {
        boolean argis;
        if(args.length > 0)
            argis = 1;
        else
            argis = 0;
        System.out.println(argis);
    }
}

/**
A resposta certa é (b). Não compila pois boolean em Java só pode ser
false ou true.
 */