package a.b.c;

import java.util.*;

class D {
   public static void main(String[] args) {
        ArrayList<String> existing = new ArrayList<String>();

        for (String arg : args) {
            if (new E().exists(arg))
            existing.add(arg);
        }
    }
}

import java.io.*;

class E {
    public boolean exists(String name) {
        File f = new File(name);
        return f.exists();
    }
}

/**
* A resposta certa é (a). O arquivo não compila pois não podemos ter
* um import após a definição de uma classe.
*/