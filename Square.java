public class Square extends Shape {
    private double sisi;

    // construct
    public Square(double sisi) {
        this.sisi = sisi;
    }

    // override method luas
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    // override method nama
    @Override
    public String getNama() {
        return "kotak";
    }

    // method sisi
    public double getSisi() {
        return sisi;
    }
}