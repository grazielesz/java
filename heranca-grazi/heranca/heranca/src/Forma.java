public class Forma {
    protected int lado;

    public Forma(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return String.format("%s\n", getClass().getName());
    }

}