
//5:Write a program to accept array of 5 numbers and display it.

import java.util.Scanner;

public class TestArrayDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int[] arr = new int[5];
		System.out.println("enter numbers ");
		for (i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		for (int r : arr) {
			System.out.println(r);
		}

	}
}
