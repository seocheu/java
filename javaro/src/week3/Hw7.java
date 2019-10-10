package week3;

public class Hw7 {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (i <= 100) {
			sum += i++;
		}
		System.out.println("1부터 100까지의 합= " + sum);
		System.out.println("---------------------------------\n");

		sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합= " + sum);
		System.out.println("---------------------------------\n");

		final int N1 = 30;
		for (i = N1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------------\n");

		final int N2 = 15;
		for (i = -N2; i <= N2; i++) {
			for (int j = -N2; j <= N2; j++) {
				if (i * i + j * j <= N2 * N2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}



















