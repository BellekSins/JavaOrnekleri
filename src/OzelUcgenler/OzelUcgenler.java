package OzelUcgenler;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class OzelUcgenler {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int x ,z , y;
        int i = 0;
        int a = 5;

        while(i < a){

        x = random.nextInt(1,30);
        y = random.nextInt(1,30);
        z = random.nextInt(1,30);
        
            if (x * x + y * y == z * z ) {
                System.out.println(x + "^2 + " + y + "^2 = " + z + "^2 ");
            } else {
              continue;
            }

            i++;

            if (i == a) {
                System.out.println("Devam edeyim mi (y/n)");
                String sonuc = scan.nextLine();
                if (Objects.equals(sonuc, "y")) {
                    i = 0;
                }
            }

        }
    }
}
