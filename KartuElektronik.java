package Latihan_2;

public class KartuElektronik implements Kartu {
    private String kodeBank;
    private String pin;

    // Constructor
    public KartuElektronik(String kodeBank, String pin) {
        this.kodeBank = kodeBank;
        this.pin = encode(pin);
    }

    // Implementasi metode otentikasi
    @Override
    public boolean otentikasi(String pinInput) {
        return pin.equals(encode(pinInput));
    }

    // Implementasi metode encode
    @Override
    public String encode(String pin) {
        // Sebagai contoh, menggunakan Base64 untuk enkripsi sederhana
        return java.util.Base64.getEncoder().encodeToString(pin.getBytes());
    }

    public String getKodeBank() {
        return kodeBank;
    }

    public void setKodeBank(String kodeBank) {
        this.kodeBank = kodeBank;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = encode(pin);
    }

    public static void main(String[] args) {
        KartuElektronik kartu = new KartuElektronik("123456", "1234");

        System.out.println("Otentikasi 1234: " + kartu.otentikasi("1234")); // Output: true
        System.out.println("Otentikasi 0000: " + kartu.otentikasi("0000")); // Output: false
    }
}

