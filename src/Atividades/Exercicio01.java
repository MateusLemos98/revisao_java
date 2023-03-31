package Atividades;

public class Exercicio01 {
    private int anos;
    private int meses;
    private int dias;

    public Exercicio01(){

    }

    public Exercicio01(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int calculcarTotalDias(){
        int idadeDias = (anos * 365) + (meses * 30) + dias;
        return idadeDias;
    }
}
