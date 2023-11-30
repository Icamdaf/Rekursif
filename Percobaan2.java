import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    static void cetakPangkat(int x, int y) {
        System.out.print("hitungPangkat(" + x + "," + y + ") dicetak ");
        for (int i = 0; i < y; i++) {
            System.out.print(x);
            if (i < y - 1) {
                System.out.print("x");
            }
        }
        System.out.println(" = " + hitungPangkat(x, y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        int pangkat;
        System.out.print("bilangan yang dihitung = ");
        bilangan = sc.nextInt();
        System.out.print("pangkat = ");
        pangkat = sc.nextInt();
        cetakPangkat(bilangan, pangkat);
    }
}
