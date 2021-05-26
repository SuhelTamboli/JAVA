

//6:Write a program which read aaray of 5 elements and print reverse array.

import java.util.Scanner;
public class TestReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int[] arr = new int[5];
		System.out.println("enter numbers ");
		for (i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		for (i = 4; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
