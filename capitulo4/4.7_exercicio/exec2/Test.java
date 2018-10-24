public class Test{
    public static void main(String[] args){
        new B().imprime();
    }
}

/**
A resposta certa é (b). Dá NullPointerException! msg é null e
não dá pra chamar isEmpty em null.
 */