class Exec2 {
     public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
         System.out.println(i);

        System.out.println(i);
        System.out.println("finished");
    }
}

/** 
* A resposta certa é (a). A variável i não pode ser acessada fora do laço,
* repare que o laço não foi declarado com {, uma pegadinha clássica da prova.
*/