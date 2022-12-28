package Faktoriyel;

// Scanner'ı çağırıyoruz.
import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        // 0! = 1 olduğu için sonucu bire eşitliyoruz.
        int sonuc = 1;

        // Scanner'ı scan olarak tanımlıyoruz.
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan sayı girmesini istiyoruz.
        System.out.print("----------------------------- \nFaktöriyel Hesaplama\n----------------------------- \nBir Sayı Giriniz : ");
        int x = scan.nextInt();

        // Girilen sayinin faköriyelini alıyoruz.
        for (int i = 1 ; i <= x ; i ++){
            sonuc = sonuc * i;
        }
        // Sonucu yazdırıyoruz.
        System.out.println();
        System.out.println( x + "! = " + sonuc);

        System.out.println("**Program bitmistir**");

    }
}