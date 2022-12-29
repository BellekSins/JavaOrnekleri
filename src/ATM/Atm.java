package ATM;


import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bakiye = 1000;

        System.out.println("Bakiyeniz : " + bakiye);

        System.out.println("İslemler");
        System.out.println("1. Para Çekme");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Bakiye Sorgulama");
        System.out.println("4. Kart İade");

        System.out.print("İslem Seçiniz : ");
        int islem = scan.nextInt();
        switch (islem) {
            case 1 -> {
                System.out.println("Bakiyeniz : " + bakiye);
                System.out.println("Çekmek istediğiniz tutarı giriniz");
                int tutar = scan.nextInt();
                while (tutar > bakiye) {
                    System.out.println("Bakiyeniz Yetersiz. \nTekrar tutar giriniz.");
                    tutar = scan.nextInt();
                }
                bakiye -= tutar;
                System.out.println("Yeni bakiyeniz : " + bakiye);
            }
            case 2 -> {
                System.out.println("Bakiyeniz : " + bakiye);
                System.out.println("Çekmek istediğiniz tutarı giriniz");
                int tutar = scan.nextInt();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz : " + bakiye);
            }
            case 3 -> System.out.println("Bakiyeniz : " + bakiye);
            case 4 -> System.out.println("Kartınızı almayı unutmayınız!");
            default -> System.out.println("Yanlış islem girdiniz.\nTekrar deneyiniz.");
        }
    }
}
