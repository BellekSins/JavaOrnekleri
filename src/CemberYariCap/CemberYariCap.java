package CemberYariCap;

import java.util.Scanner;

public class CemberYariCap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Yarıçap giriniz : ");
        int yaricap = scan.nextInt();

        System.out.println("Girilen yarıçapın çevresi : "  + 2 * Math.PI * yaricap + "\nGirilen yarıçapın alanı : "  + (Math.PI * yaricap)*(Math.PI * yaricap) );
    }
}
