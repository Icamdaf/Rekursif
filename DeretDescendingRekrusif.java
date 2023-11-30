import java.util.Scanner;

public class DeretDescendingRekursif {
    static void cetakDeretRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            cetakDeretRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("Deret Descending Rekursif:");
        cetakDeretRekursif(n);
    }
}
