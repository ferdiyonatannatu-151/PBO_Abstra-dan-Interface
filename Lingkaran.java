package latihan_1;

public class Lingkaran extends Bentuk {

    public Lingkaran(int jari2) {
        super(jari2);
    }

    @Override
    public double luas() {
        return PHI * jari2 * jari2;
    }

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Luas lingkaran: " + lingkaran.luas());
    }
}
