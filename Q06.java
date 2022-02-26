package grupTekrar;

public class Q06 {
    public static void main(String[] args) {


    String input="aaabbccccddddd";
    String[] array=input.split("");
    int sayacA =0;
    int sayacB=0;
    int sayacC =0;
    int sayacD =0;

    for (int i = 0; i < array.length; i++) {
        if (array[i].contains("a")){
            sayacA++;
        }
        if (array[i].contains("b")){
            sayacB++;
        }
        if (array[i].contains("c")){
            sayacC++;
        }
        if (array[i].contains("d")){
            sayacD++;
        }
    }
    System.out.println(array[sayacA-1]+sayacA+array[sayacA+sayacB-1]
            +sayacB+array[sayacA+sayacB+sayacC-1]
            +sayacC+array[sayacA+sayacB+sayacC+sayacD-1]+sayacD);

}
}
