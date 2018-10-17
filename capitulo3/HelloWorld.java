public class HelloWorld{

    public static void main(String[] args) {
       // reading the first (0) position
       for (int i = 0; i < args.length; i++)
          System.out.println("Hello " + args[i] + "!");
    }
}