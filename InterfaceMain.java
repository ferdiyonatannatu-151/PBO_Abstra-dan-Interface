package Latihan_2;

public class InterfaceMain {
    public static void main(String[] args) {
        KartuElektronik kartu = new KartuElektronik("IF111", "123");
        System.out.println("Otentikasi: " + kartu.otentikasi("123")); // Output: true
        System.out.println("Otentikasi: " + kartu.otentikasi("000")); // Output: false
    }
}

