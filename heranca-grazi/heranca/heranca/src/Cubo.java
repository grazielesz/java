public class Cubo extends FormaTridimensional {

    public Cubo(int lado) {
        super(lado);
    }

    public double calculoVolume() {
       return super.lado * super.lado * super.lado;
    }

    public double calculoArea() {
         return 6 * (super.lado * super.lado);
    }

}
