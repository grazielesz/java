public class Esfera extends FormaTridimensional {

    public Esfera(int raio) {
        super(raio);
    }

    public double calculoVolume() {
        double volume;
        double pi = 3.14;
        volume = (4/3) * pi * (super.raio * super.raio * super.raio);
        return volume;
    }

    public double calculoArea(){
        double area;
        double pi = 3.14;
        area = 4 * pi * (super.raio * super.raio);
        return area;
    }
    
}
