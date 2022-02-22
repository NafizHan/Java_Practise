package HAlukHocaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		/*
		 * Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
		 * toplamını bulunuz. Sonucu ekrana yazdırınız.
		 */
		Scanner ekran = new Scanner(System.in);
		System.out.println("Karesi alıcak sayılar boşluk bırakarak giriniz");
		String sayilar = ekran.nextLine();
		String arr[] = sayilar.split(" ");
		List<Integer> sayi = new ArrayList<>();
		for (String s : arr) {
			sayi.add(Integer.valueOf(s));
		}
		System.out.println(sayi);
		List<Integer> kareler = new ArrayList<>();
		int top = 0;
		for (Integer i : sayi) {
			kareler.add(i * i);
			top += i * i;
		}
		System.out.println(kareler);
		System.out.print("Karelerin toplamı :" + top);

	}

}
