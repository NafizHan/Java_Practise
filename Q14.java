package grupTekrar.stringManipulation;

public class Q04 {
      /*4---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
    Test data:
    12,24,34
    Beklenen Çıktı:
    12
    */
      public static void main(String[] args) {
          enKucukSayi();

          System.out.println(enKucukSayi());
      }

      private static int enKucukSayi() {
            int [] dizi={15,12,24,34};
            int enKucukSayi=dizi[0];

          for (int sayi :dizi) {
            if(enKucukSayi>sayi)
                enKucukSayi=sayi;
          }

          return enKucukSayi;

    }
}
