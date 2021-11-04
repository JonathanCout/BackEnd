public abstract class Figura {

    private double dimensao;
    private double perimetro;

    public Figura(double dimensao) {
        this.dimensao = dimensao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public abstract double calcularPerimetro();
}
