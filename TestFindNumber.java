
// 7:Write a Java program , accept array ,accept number from user and  find the index of number in array if present else show message not exist.
import java.util.Scanner;

public class TestFindNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, n;
		boolean flag = true;
		int[] arr = new int[5];
		System.out.println("enter array elements ");
		for (i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the number to be searched ");
		n = sc.nextInt();
		int in;
		for (in = 0; in < arr.length; in++) {
			if (n == arr[in]) {
				System.out.println("the number is present at " + in + "position");
				flag = false;
			}
		}
		if (flag == true)
			System.out.println("number does not exist");

	}

}
