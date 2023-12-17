public class ShapeTest {
    public static void main(String[] args) {
        // objek bulat dan kotak
        Circle bulat = new Circle(4.0);
        Square kotak = new Square(5.0);

        // menampilkan informasi bulat
        System.out.println("bentuk : " + bulat.getNama());
        System.out.println("jari jari : " + bulat.getJari());
        System.out.println("luas : " + bulat.getLuas());

        System.out.println("");

        // menampilkan informasi kotak
        System.out.println("bentuk : " + kotak.getNama());
        System.out.println("sisi : " + kotak.getSisi());
        System.out.println("luas : " + kotak.getLuas());
    }
}