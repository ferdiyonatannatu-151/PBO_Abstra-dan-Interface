package latihan_1;

public class Tabung extends Bentuk {
    private int tinggi;

    // Default constructor
    public Tabung() {
        super(0);
    }

    // Parameterized constructor
    public Tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    /**
     * Menghitung luas permukaan tabung: L = 2 * PHI * r * (r + t)
     */
    @Override
    public double luas() {
        return 2 * PHI * jari2 * (jari2 + tinggi);
    }

    // Setter & Getter
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public static void main(String[] args) {
        Tabung tabung = new Tabung(7, 10);
        System.out.println("Luas permukaan tabung: " + tabung.luas());
    }
}