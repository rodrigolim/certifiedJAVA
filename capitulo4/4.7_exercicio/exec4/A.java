class A{
    public static void main(String[] args){
        String s1 = "Caelum";
        s1.concat(" - Ensino e Inovação");
        System.out.println(s1);

        StringBuffer s = new StringBuffer("Caelum");
        s.append(" - Ensino e Inovação");
        System.out.println(s);
    }
}

//A resposta certa é (a). ‘Caelum‘ e ‘Caelum - Ensino e Inovação‘.
