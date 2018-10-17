class Exec5 {
    static int i = 3;

    public static void main(String[] a) {
         for (new Exec5().i = 10; new Exec5().i < 100; 
              new Exec5().i++) {
            System.out.println(i);
         }
    }
}

/** 
* A resposta certa é (d). Isso porque o acesso à variável estática pode
* ser feito através da instância da classe ou diretamente caso seja uma
* variável estática sendo acessada por um método estático.
*/