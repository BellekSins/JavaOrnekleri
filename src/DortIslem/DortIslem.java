package DortIslem;

public class DortIslem {
    static void toplama(int x , int y , int sonuc){
        sonuc = x + y;
        System.out.println("Girilen iki sayının toplamı : "+sonuc);
    }
    static void cikarma(int x , int y , int sonuc){
        sonuc = x - y;
        System.out.println("Girilen iki sayının farkı : "+sonuc);
    }
    static void carpma(int x , int y , int sonuc){
        sonuc = x * y;
        System.out.println("Girilen iki sayının çarpımı : "+sonuc);
    }
    static void bolme(int x , int y , int sonuc){
        sonuc = x / y;
        System.out.println("Girilen iki sayının bölümü : "+sonuc);
    }
}
