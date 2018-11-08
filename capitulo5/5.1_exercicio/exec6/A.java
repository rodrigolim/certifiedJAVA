public class A{
    public static void main(String[] args){
        System.out.println(3 / 0); //zero
        System.out.println(3 / 0.0); //infinite
        System.out.println(3.0 / 0); //0
        System.out.println(-3.0 / 0); //0
    }
}

/**
1ª linha: ArithmeticException: / by zero 
2ª linha: Infinity 
3ª linha: Infinity 
4ª linha: -Infinity
 */