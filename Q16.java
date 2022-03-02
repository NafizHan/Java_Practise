package grupTekrar.doWhile;

import java.util.Scanner;

public class Q06 {
    //Bir top belirli yükseklikten atılmaktadır.
// Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
// Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
// Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen  topun birakilacagi yukseligi giriniz : ");
        double yukseklik = scan.nextDouble();

        double toplamYol = 0;
        int yereVurmaSayisi = 0;


       do {
            yereVurmaSayisi++;
            toplamYol+=yukseklik;
           yukseklik *=(3.0/4.0);

           toplamYol+=yukseklik;

        }  while (yukseklik>= 1);

        System.out.println(yereVurmaSayisi);
        System.out.println(toplamYol);

    }
}

