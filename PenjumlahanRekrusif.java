import java.util.Scanner;

public class PenjumlahanRekursif {
    static int jumlahRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + jumlahRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai f: ");
        int f = scanner.nextInt();

        int hasil = jumlahRekursif(f);
        System.out.println("Penjumlahan Rekursif: " + hasil);
    }
}
