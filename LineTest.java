public class LineTest {
    public static void main(String[] args) {
        Line garisA = new Line(1, 3, 5, 8);
        Line garisB = new Line(2, 4, 6, 12);
        
        boolean lebihDari = garisA.isGreater(garisA, garisB);
        boolean kurangDari = garisA.isLess(garisA, garisB);
        boolean samaDengan = garisA.isEqual(garisA, garisB);

        System.out.println("garisA lebih dari garisB ? " + lebihDari);
        System.out.println("garisA kurang dari garisB ? " + kurangDari);
        System.out.println("garisA sama dengan garisB ? " + samaDengan);
    }
}