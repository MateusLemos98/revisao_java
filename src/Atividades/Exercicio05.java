package Atividades;

public class Exercicio05 {
    private double salarioMinimo;
    private double salarioUsuario;

    public Exercicio05(double salarioMinimo, double salarioUsuario) {
        this.salarioMinimo = salarioMinimo;
        this.salarioUsuario = salarioUsuario;
    }

    public double calcQuantiSalMin(){
        double quantiSalMin = salarioUsuario / salarioMinimo;
        return quantiSalMin;
    }
}
