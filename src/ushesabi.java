import java.util.Scanner;

public class ushesabi {

    static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usAlma(taban, us-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int taban = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = input.nextInt();

        System.out.println("Sonuç: " + usAlma(taban, us));
    }
}