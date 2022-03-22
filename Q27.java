package _05_StringManipulation;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        String str="01:00am-03:05pm";
        int ilkSaat= Integer.parseInt(str.substring(0,2));
        int ilkDakika= Integer.parseInt(str.substring(3,5));
        int ikinciSaat = Integer.parseInt(str.substring(8,10));
        int ikinciDakika= Integer.parseInt(str.substring(11,13));
        if (str.substring(5,7).equals(str.substring(13))){

            System.out.println(((ikinciSaat*60)+ikinciDakika)-((ilkSaat*60)+ilkDakika));

        }else
            System.out.println(((ikinciSaat*60)+ikinciDakika)-((ilkSaat*60)+ilkDakika)+720);
    }
}
