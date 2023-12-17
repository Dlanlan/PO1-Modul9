public class Circle extends Shape {
    private double jari;

    // construct
    public Circle(double jari) {
        this.jari = jari;
    }

    // override method luas
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // override methode nama
    @Override
    public String getNama() {
        return "bulat";
    }

    // method jari
    public double getJari() {
        return jari;
    }
}