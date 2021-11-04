public class Quadrado extends Figura{

    public Quadrado(double dimensao) {
        super(dimensao);
    }

    @Override
    public double calcularPerimetro() {
        return 4*this.getDimensao();
    }


}
