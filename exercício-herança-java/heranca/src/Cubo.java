public class Cubo extends FormaTridimensional{

    public Cubo(int lado) {
        super(lado);
    }

    public double calculoVolume(){
        double volume;
        volume = super.lado * super.lado * super.lado;
        return volume;
    }

    public double calculoArea(){
        double area;
        area = 6 * (super.lado * super.lado);
        return area;
    }
    
}
