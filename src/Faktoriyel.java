import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int sonuc = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("----------------------------- \n Faktöriyel Hesaplama\n----------------------------- \n Bir Sayı Giriniz : ");
        int x = scan.nextInt();
        for (int i = 1 ; i <= x ; i ++){
            sonuc = sonuc * i;
        }
        System.out.print("-----------------------------\n"+ x +"! = "+ sonuc);





    }
}