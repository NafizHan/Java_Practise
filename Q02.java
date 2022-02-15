package qa6teamproje;

public class Q05 {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 2, 324, 1 }, { 51, 5, 5 }, { 2, 10, 3 } };
        int maxElement = 0;//1 e esitledik arr[0][0] yada 0 a atasak da olur
        for (int kat = 0; kat < arr.length; kat++) {
            
            for (int daire = 0; daire < arr[kat].length; daire++) {
                
                if (arr[kat][daire]>maxElement) {
                    maxElement=arr[kat][daire];
                }
                
                
            }
            
            
        }
        System.out.println(maxElement);
	}

}
