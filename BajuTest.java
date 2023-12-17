public class BajuTest {
    public static void main(String[] args) {
        Baju baju = new Baju();
        baju.setKeterangan("baju batik");
        baju.setHarga(200000);
        baju.setJmlStok(50);
        baju.kodeWarna = 'R';

        System.out.println("Informasi Baju : ");
        baju.tampilInformasiBaju();
        }
}