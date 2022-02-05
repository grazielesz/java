public class Triangulo extends FormaBidimensional {
    private int altura;
  
    public Triangulo(int lado, int altura){
      super(lado);
      this.altura =altura;
    }
    public int getAltura(){
      return altura;
    }
    public void setAltura(int altura){
      this.altura = altura;
    }

    public int calculoArea(){
        int area;
        area = (super.lado * this.altura)/2;
    return area;
    }
}
