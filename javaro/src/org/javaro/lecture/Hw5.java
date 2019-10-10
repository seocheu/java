package org.javaro.lecture;

public class Hw5 {

	public static void main(String[] args) {
		System.out.println("심성민" + "-" + "201901001" + "-" + "연산자 숙제");

		int secondVar = 1000;
		int minOut = secondVar / 60;
		int secondOut = secondVar % 60;
		System.out.println(secondVar + "초 = " + minOut + "분 " + secondOut + "초");
		System.out.println("-------------------------------\n");

		int a = 10, b;
		a++;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println("-------------------------------\n");

		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		System.out.println("-------------------------------\n");

		a = 100;
		b = 100;
		System.out.println("a와 b는 같은 크기?" + (a == b));
		System.out.println("a가 b보다 큰가요?" + (a > b));
		System.out.println("a = b이고 a > 30인가요?" + ((a == b) && (a > b)));
		System.out.println("a가 50이 아닌가요?" + !(a == 50));
		System.out.println("-------------------------------\n");

		a = 100;
		b = 50;
		System.out.println("a > b? " + ((a > b) ? a : b));
		System.out.println("-------------------------------\n");

		double c = Math.pow(2.0, 32.0);
		System.out.println("2.0의 32.0 제곱은 " + (int) c + "입니다");
		System.out.println("-------------------------------\n");

		boolean d = (3 > 3);
		System.out.println(d);
		d = (4 < 3);
		System.out.println(d);
		d = (4 >= 3);
		System.out.println(d);
		d = (3 <= 3);
		System.out.println(d);
		d = (4 == 3);
		System.out.println(d);
		d = (4 != 3);
		System.out.println(d);
		System.out.println("-------------------------------\n");

		d = ((3 > 3) && (4 > 3));
		System.out.println(d);
		d = ((3 < 3) && (4 < 3));
		System.out.println(d);
		d = ((3 > 3) || (4 <= 3));
		System.out.println(d);
		d = ((3 < 3) && (4 > 3));
		System.out.println(d);
		d = !(4 == 3);
		System.out.println(d);
		d = !(4 != 3);
		System.out.println(d);
		System.out.println("-------------------------------\n");

		int x = 6, y = 7;
		System.out.println(!(x > 6));
		System.out.println((x == 6 && x == 5));
		System.out.println((x == 6 || x == 5));
		System.out.println((x > -1 && y < 10));
		System.out.println((x > 10 && x < 5));
	}

}



























