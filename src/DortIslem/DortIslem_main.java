package DortIslem;

import java.util.Scanner;

public class DortIslem_main {

    public static void main(String[] args) {

        int x, y;

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        x = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        y = scan.nextInt();

        System.out.println("-----------------------------");

        DortIslem.toplama(x,y,0);
        DortIslem.cikarma(x,y,0);
        DortIslem.carpma(x,y,0);
        DortIslem.bolme(x,y,0);

        System.out.println("-----------------------------");

        System.out.println("**Program bitmistir**");


    }
}
