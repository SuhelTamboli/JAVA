//3:Write function to swap two numbers.

import java.util.Scanner;

public class TestSwap {

	public static void swap() {
		Scanner sc = new Scanner(System.in);

		int a, b, t;
		System.out.println("enter one number");
		a = sc.nextInt();
		System.out.println("enter another number");
		b = sc.nextInt();
		System.out.println("the number before swapping a= " + a + " b = " + b);
		t = a;
		a = b;
		b = t;
		System.out.println("the number after swapping a= " + a + " b = " + b);

	}

	public static void main(String[] args) {

		swap();

	}

}




