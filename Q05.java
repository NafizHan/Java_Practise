package grupTekrar;

import java.util.Scanner;

public class Q05 {
    /*5----
 Ask user to enter the number of lines of a  pyramid .
 Type a program to create the pyramid.
 For example if the number of lines is 5, the pyramid will be like;
             *
            * *
           * * *
          * * * *
         * * * * *
 Kullanıcının  girdigi satır sayısı kadar * ile piramid sekli yazdıran bir program create ediniz.
 */
    public static void main(String[] args) {
        System.out.println("Lutfen bir pozitif tamsayi giriniz : ");
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = sayi; j >i ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println( );
        }

    }


}
