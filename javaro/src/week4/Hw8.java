package week4;

public class Hw8 {

	public static void main(String[] args) {
		int max = 30;
		int count;

		System.out.print("소수는");
		for (int i = 2; i <= max; i++) {
			count = 0;
			for (int j = 2; j < i - 1; j++) {
				if (i % j != 0)
					continue;
				count++;
			}
			if (count == 0 && i !=2)
				System.out.print(", " + i);
			else if(count == 0) {
				System.out.print(" " + i);
			}
		}
		System.out.println("입니다.");

	}

}
