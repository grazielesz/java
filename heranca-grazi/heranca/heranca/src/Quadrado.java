public class Quadrado extends FormaBidimensional {
    public Quadrado(int lado) {
        super(lado);
    }

    public int calculoArea() {
        return getLado() * getLado();
    }

    public int calculoPerimetro(){
        return 4 * getLado();
    }

}
