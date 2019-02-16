package basic.step2.ex02;

public class Main {

	public static void main(String[] args) {
		int[][] dist = findDist();
		System.out.println(arrayFormat(dist));
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
	
	public static int[][] findDist() {
		
		int[][] dist = new int[8][8];

		//---------------------------------------
		// TODO : Write code here
		
		//---------------------------------------
		
		return dist;
	}

}
