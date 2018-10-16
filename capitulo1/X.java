class X {
    static int a = 100;
    public static void main(String args[]) {
        int a = 200; // shadowing
        System.out.println(a); // 200
    }
}