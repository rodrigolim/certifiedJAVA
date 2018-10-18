import model.basic.Client;
import model.advanced.*;

class exec3 {
    public static void main(String[] args) {
        System.out.println("Welcome " + new Client().name);
    }
}

/**
A resposta certa é (c). Não existe ambiguidade uma vez que o import
específico tem preferência em cima do * .

 */