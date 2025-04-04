package exercicio_03;

public class Calculo {
    double base = 0;
    double altura = 0;

    public Calculo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro () {
        return 2 * (base + altura);
    }
}
