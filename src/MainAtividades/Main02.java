package MainAtividades;

import Atividades.Exercicio02;

public class Main02 {
    public static void main(String[] args) {
        Exercicio02 media01 = new Exercicio02(8, 9, 7);
        Exercicio02 media02 = new Exercicio02(4, 5, 6);

        System.out.println(media01.media());
        System.out.println(media02.media());
        System.out.println((media01.media()+media02.media())/2);
    }
}
