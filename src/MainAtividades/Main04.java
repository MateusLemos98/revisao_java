package MainAtividades;

import Atividades.Exercicio04;

public class Main04 {
    public static void main(String[] args) {
        Exercicio04 calculadora = new Exercicio04(10, 321, 20, 6, 462, 15, 10);

        System.out.println("O valor total a ser pago é " + calculadora.calcValorTotal());
    }
}
