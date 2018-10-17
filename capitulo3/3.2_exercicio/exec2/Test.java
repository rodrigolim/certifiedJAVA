class Test {
    int Test = 305;

    void Test() {
        System.out.println(Test);
    }

    public static void main(String[] args) {
        new Test();
    }
}

/**
* A resposta certa é (e). O código compila e roda, não imprimindo nada,
* pois não chamamos o método Test, somente o construtor Test().
*/

