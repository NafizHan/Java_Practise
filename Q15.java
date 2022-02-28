package grupTekrar.stringManipulation;

import java.util.Scanner;

public class Q05 {
 /*5----
    Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.
    Test Data:
    java is fun
    Beklenen Çıktı:
    Stringdeki sesli harf sayısı: 4
    */
 public static void main(String[] args) {

     sesliHarf();


 }

    private static void sesliHarf() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Test Data : ");
        String yazi = scan.nextLine();

        String sesli = "euoia";
        int sayac = 0;

        for (int i = 0; i < yazi.length(); i++) {
            String harf = yazi.substring(i, i + 1);
            if (sesli.contains(harf)) {
                sayac++;
            }
        }
        System.out.println("girilen cümlede "+sayac+" adet sesli harf bulunmaktadır");

        }


    }