class exec3 {
    public static void main(String[] args) {
        System.out.println(args); // A
        System.out.println(args.length); // B
        System.out.println(args[0]); // C
    }
}

//c) Ao rodar sem argumentos, ocorre uma ArrayIndexOutOfBoundsException na linha C. 

/**
Ao rodar sem argumentos, nosso array tem tamanho zero, portanto,
ao tentar acessar seu primeiro elemento recebemos um
ArrayIndexOutOfBoundsException na linha C. A resposta certa é (c).
 */