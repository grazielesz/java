public class Circulo extends FormaBidimensional {
    final double PI = 3.14;

    public Circulo(int raio) {
        super(raio);
    }

    public double getRaio() {
        return super.raio;
    }

    public int calculoArea() {
        return  (super.raio * super.raio) * PI;
    }
}