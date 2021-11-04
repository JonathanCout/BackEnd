public class Circulo extends Figura{

    public Circulo(double dimensao) {
        super(dimensao);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*2*this.getDimensao();
    }


}
