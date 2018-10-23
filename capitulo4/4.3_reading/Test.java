public class Test{
    public static void main(String[] args){
        Car a = new Car();
        a.model = "Ferrari"; // A. acessando diretamente o atributo
        a.setModel("Ferrari"); // B. acessando o atributo por um método
        // acessando o método e passando o retorno como argumento para
        // o método println
        System.out.println(a.getData());
    }

}