public class A{

    public static void main(String[] args){
        int i1 = 3/2;  //1
        double i2 = 3/2; //1
        double i3 = 3/2.0; //1,5
        long x = 0; //0
        double d = 0; //0
        double zero = x + d; //0

        System.out.println(i1 + i2 + i3 + x + d + zero); //3.5
    }
}

/**
A resposta certa é (b). Análise linha a linha:
– divisão inteira: i1 vale 1
– divisão inteira, que depois é promovido a double: i2 vale 1.0
– divisão double: i3 vale 1.5
– x vale 0L e d vale 0.0 (duas promoções)
– O resultado é 3.5
 */