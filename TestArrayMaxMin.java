
//8:Write a Java program to find the maximum and minimum value of an array.

import java.util.Scanner;

public class TestArrayMaxMin {

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
		int max = arr[0];
		for (i = 1; i < arr.length; i++)

		{
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("max = " + max);

		int min = arr[0];
		for (i = 1; i < arr.length; i++)

		{
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("min = " + min);
	}

}
