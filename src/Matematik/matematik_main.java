package Matematik;

import java.util.Scanner;

public class matematik_main {

    public static void main(String[] args) {

        int x, y;

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        x = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        y = scan.nextInt();

        System.out.println("-----------------------------");

        matematik.toplama(x,y,0);
        matematik.cikarma(x,y,0);
        matematik.carpma(x,y,0);
        matematik.bolme(x,y,0);

        System.out.println("-----------------------------");

        System.out.println("**Program bitmistir**");


    }
}
