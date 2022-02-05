public class Circulo extends FormaBidimensional {

    public Circulo (int raio){
      super(raio);
    }
    public double calculoArea(){
      double area;
      area = (super.raio * super.raio ) * Math.PI;
      return (int) area;
    }
  }