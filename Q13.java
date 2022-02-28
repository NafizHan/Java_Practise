package grupTekrar.stringManipulation;

public class Q07 {
    /*7---
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
     */

    public static void main(String[] args) {
        String  str1= "%13.99";
        String str2= "%10.55";

        String str1Sayi=str1.replace("%","");
        String str2Sayi=str2.replace("%","");
        double sayi1= Double.parseDouble(str1Sayi);
        double sayi2= Double.parseDouble(str2Sayi);
        System.out.println(sayi1+sayi2);
    }
}
