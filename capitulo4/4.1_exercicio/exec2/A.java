class A {
    public static void main(String[] args) {
        int age;
        if(args.length > 0) {
            age = Integer.parseInt(args[0]);
        } else {
            System.err.println("???");
        }
        System.out.println(age);
    }
}

/**
A resposta certa é (a). O código não compila pois tentamos acessar a
variável age que pode não ter sido inicializada. Não é certeza (somente
se cair no if ela será inicializada).
 */