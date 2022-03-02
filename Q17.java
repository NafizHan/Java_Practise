package grupTekrar.doWhile;

import java.util.Scanner;

public class Q05_2 {
    public static void main(String[] args) {

        //5- Kullanicidan iki pozitif sayi isteyin
// kullanici negatif sayi girdiginde
// girilen negatif sayilari yok sayip, yeniden deger isteyin
// kullanici dogru giris yaptiginda "well done" ve sayilarin carpini yazdirin

        Scanner scan=new Scanner(System.in);
        int sayi1 ;
        int sayi2;

        do {
            System.out.println("lutfen sayi1 icin pozitif tamsayi giriniz");
            sayi1= scan.nextInt();
            System.out.println("lutfen sayi2 icin pozitif bir tamsayi giriniz");
            sayi2= scan.nextInt();
        }
        while (!(sayi1>0 && sayi2>0));

        System.out.println("Sayilarin carpimi : "+(sayi1*sayi2));
    }


}

