import model.basic.Client;
import model.basic.Client;

class exec4 {
    public static void main(String[] args) {
        System.out.println("Welcome " + new Client().name);
    }
}

/**
A resposta certa é (c). Não há erro de ambiguidade, simplesmente um
import é desnecessário e não gera erro nenhum, apenas um warning.
 */