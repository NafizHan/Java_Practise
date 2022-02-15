package qa6teamproje;

public class Q06 {

	public static void main(String[] args) {

/*
		​
		         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
		​
		         int 2D arrayini  olustur
		​
		        2D arrayinden min number print et
		​
		     */
		
		int arr[][] = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
		minimum(arr);
		
	}
	
	static void minimum(int arr[][]) {
		int min = arr[0][0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (min>arr[i][j]) {
					min=arr[i][j];
				} 
			} 
		} System.out.println(min);
	}

}
