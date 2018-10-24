class A{
    public static void main(String [] args){
        String s = "aba";
        for(int i = 0; i < 9; i++) {
            s = s +"aba";
        }
        System.out.println(s.length);
    }
}

/**
A resposta certa é (a). Não compila, pois length() é um método de
String, diferente dos arrays em que length é um atributo.
 */