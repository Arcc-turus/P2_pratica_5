package Retangulo;

public class Retangulo {

    private double altura;
    private double largura;

    public Retangulo() {
        this.altura = 1.0;
        this.largura = 1.0;
    }

    public void setAltura(double altura) {
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: Altura inválida. O valor não foi alterado.");
        }
    }

    public void setLargura(double largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Erro: Largura inválida. O valor não foi alterado.");
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public double calcularPerimetro() {
        return 2 * (this.altura + this.largura);
    }

    public double calcularArea() {
        return this.altura * this.largura;
    }
}