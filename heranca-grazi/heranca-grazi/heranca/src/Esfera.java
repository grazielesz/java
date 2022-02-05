public class Esfera extends FormaTridimensional {

    public Esfera(int raio) {
        super(raio);
    }

    public double calculoVolume() {
        double volume;
        volume = (4/3) * Math.PI * (super.raio * super.raio * super.raio);
        return volume;
    }

    public double calculoArea(){
        double area;
        area = 4 * Math.PI * (super.raio * super.raio);
        return area;
    }
    
}
