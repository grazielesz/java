public class Esfera extends FormaTridimensional {
    final double PI = 3.14;

    public Esfera(int raio) {
        super(raio);
    }

    public double getRaio() {
        return super.raio;
    }

    public double calculoVolume() {
        return (4 / 3) * PI * (super.raio * super.raio * super.raio);
    }

    public double calculoArea() {
        return 4 * PI * (super.raio * super.raio);
    }

}
