package basic.step2.ex03;

public class Main {

	public static void main(String[] args) {
		/*
		// example 1
		int[][] A = { { 1, 2, 3 }
				     ,{ 4, 5, 6 }
				     ,{ 7, 8, 9 } };
		*/ 
		
		// example 2
		int[][] A = { { 5, 6, 7, 8 }
	     			,{ 2, 3, 4, 0 } }; 
		
		int[][] tr = findTranspose(A);
		
		System.out.println(arrayFormat(tr));
	}
	
	public static String arrayFormat(int[][] arr) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(j>0) sb.append("\t");
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static int[][] findTranspose(int[][] A) {
		//---------------------------------------
		// TODO : Write code here
		
		return A;
		
		//---------------------------------------
	}

}
