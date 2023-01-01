package CemberYariCap;

import java.util.Scanner;

public class CemberYariCap {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float pi = (float) Math.PI;

        System.out.print("Yarıçap giriniz : ");
        int yaricap = scan.nextInt();

        System.out.println("Girilen yarıçapın çevresi : "  + 2 * pi * yaricap );
        System.out.println("Girilen yarıçapın alanı : "  + (pi * yaricap)*(pi * yaricap));

    }
}
