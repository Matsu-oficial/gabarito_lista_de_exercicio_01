package exercicio_07;

public class Bola {
    private String cor;
    private double tamanho;

    public Bola(String cor, double tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public Bola maiorBola(Bola a, Bola b) {
        Bola aux = null;
        if (this.tamanho > a.tamanho && this.tamanho > b.tamanho){
            aux = this;
        } else if (a.tamanho > b.tamanho) {
            aux = a;
        } else {
            aux = b;
        }
        return aux;
    }

    public String retornarDados() {
        return cor + " " + tamanho;
    }
}
