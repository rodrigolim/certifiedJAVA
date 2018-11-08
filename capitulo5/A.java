public class A{
    public static void main(String[] args){
        int i = 5;
        System.out.println(i % 2 == 0 ? "Zero":"nao");
        System.out.println("***********************");
        int v = 0;
        // compila, mas exception
        //System.out.println(i / v);
        // compila e roda, infinito positivo
        System.out.println(i / 0.0);
        System.out.println("***********************");
        System.out.println(1 == 1); // true.
        System.out.println(1 != 1); // false.
        System.out.println(2 < 1); // false.
        System.out.println(2 > 1); // true.
        System.out.println(1 >= 1); // true.
        System.out.println(2 <= 1); // false.        
        //System.out.println("Mario" > "Guilherme"); // não compila, tipo não primitivo só aceita != e ==        
        //System.out.println(true < false); // não compila, boolean só aceita != e ==
        System.out.println("***********************");
    }
}