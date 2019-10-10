package week4;

public class Ex5_3 {

	public static void main(String[] args) {
		System.out.println("심성민" + "20191010" + "-" + "변수");
		int b00 = 8, b01 = 5, b02 = 2, b03 = 3, b04 = 6;
		int b10 = 5, b11 = 4, b12 = 1;
		System.out.println("동일타입변수 = " + b00 + ", " + b01 + ", " + b02 + ", " + b03 + ", " + b04);
		System.out.println("동일타입변수 = " + b10 + ", " + b11 + ", " + b12);
		int[][] b = new int[][] { { 8, 5, 2, 3, 6 }, { 5, 4, 1 } };
		System.out.println("동일타입변수 = " + b[0][0] + ", " + b[0][1] + ", " + b[0][2] + ", " + b[0][3] + ", " + b[0][4]);
		System.out.println("동일타입변수 = " + b[1][0] + ", " + b[1][1] + ", " + b[1][2]);
		System.out.print("동일타입배열0 = ");
		for (int i = 0; i < b[0].length; i++) {
			System.out.print(b[0][i] + " ");
		}
		System.out.println("");
		// for(int i = 0; i<b.length; i++) {
		// for(int j = 0; j<b[i].length; j++) System.out.print(b[0][i]+" "); }
	}

}
