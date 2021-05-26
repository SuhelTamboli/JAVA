
//9: Write a program to create an array of integers and perform following operations on that array like 
//finding the sum, average, maximum and minimum number in that array. Accept the numbers of the 
//array from user.
//finding the sum, average, maximum and minimum number in that array. //Accept the numbers of the array from user.
import java.util.Scanner;

public class TestArrayOperations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
		int[] arr = new int[5];
		System.out.println("enter numbers ");
		for (i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		for (i = 0; i < 5; i++) {
			sum = sum + arr[i];
		}
		System.out.println("the sum of the elements " + sum);

		double avg = sum / 5;
		System.out.println("the average of the elements " + avg);

		int max = arr[0];
		for (i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("max = " + max);

		int min = arr[0];
		for (i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("min = " + min);

	}

}
