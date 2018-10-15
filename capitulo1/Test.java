class Test {
    public static void main(String[] args) {
        Person p = new Person();
        // instance reference access: 15
        System.out.println(p.id);
        // class reference access: 15
        System.out.println(Person.id);
    }
}