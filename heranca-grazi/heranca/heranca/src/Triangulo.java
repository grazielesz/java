public class Triangulo extends FormaBidimensional {
    private int altura;

    public Triangulo(int lado, int altura) {
        super(lado);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calculoArea() {
        return  (super.lado * this.altura) / 2;
    }

    public int calculoPerimetroEquilaetro() {
        return 3 * super.lado;
    }
}
