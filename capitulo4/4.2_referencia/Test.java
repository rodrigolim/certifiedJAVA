class Test{
    public static void main(String[] args){
        Car a = new Car();
        a.age = 5;
        
        Car b = new Car(); // agora b aponta para o mesmo objeto de a
        b.age = 5;

        System.out.println(a == b); // imprime 5

    }
}
