package grupTekrar.stringManipulation;

import java.util.Scanner;

public class Q06 {
   /*6---
    Kullanicidan alacaginiz, 3 kelimeden olusan ismi
    orn. Ahmet Emin Yilmaz -> A.E.Y.  formatiyla yazdiriniz.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Test Data : ");
        String isim= scan.nextLine();

        char isimIlkHarf = isim.toUpperCase().charAt(0);
        char isimIkınciHarf = isim.toUpperCase().charAt(isim.indexOf(" ") + 1);
        char soyadIlkHarf = isim.toUpperCase().charAt(isim.lastIndexOf(" ") + 1);
        System.out.println(isimIlkHarf+"."+isimIkınciHarf+"."+soyadIlkHarf+".");

    }
}
