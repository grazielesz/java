public class Tetraedro extends FormaTridimensional {

    public Tetraedro(int lado) {
        super(lado);
    }

    public double calculoVolume() {
        return ((super.lado * super.lado * super.lado) * Math.sqrt(2)) / 12;
    }

    public double calculoArea() {
        return (super.lado * super.lado) * Math.sqrt(3);
    }

}
