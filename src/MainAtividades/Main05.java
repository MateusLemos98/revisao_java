package MainAtividades;

import Atividades.Exercicio05;

public class Main05 {
    public static void main(String[] args) {
        Exercicio05 calcSalario = new Exercicio05(1305, 3000);

        System.out.printf("A quantidade de salários que esse usuário ganha é %.2f\n", calcSalario.calcQuantiSalMin());

    }
}
