public class Tetraedro extends FormaTridimensional{

    public Tetraedro(Integer lado) {
        super(lado);
    }

    public double calculoVolume(){
        double volume;
        volume = ((super.lado * super.lado * super.lado) * Math.sqrt(2))/12;
        return volume;
    }

    public double calculoArea(){
        double area;
        area = (super.lado * super.lado) * Math.sqrt(3);
        return area;
    }
    
}
