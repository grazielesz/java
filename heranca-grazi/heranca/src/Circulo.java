public class Circulo extends FormaBidimensional {

    public Circulo (int raio){
      super(raio);
    }
    public int calculoArea(){
      double area;
      double pi = 3.14;
      area = (super.raio * super.raio ) * pi;
      return (int) area;
    }
  }