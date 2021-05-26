
//2:Write a program which will accept student information like rollno,name,5 subject marks.calculate total and percentage.calculate grade.. 
//           per >75 grade :A
//           per<74 and >60 :B
//           per<59  :C
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rn;
		String name;
		int i, m;
		System.out.println("enter roll no");
		rn = sc.nextInt();
		System.out.println("roll number  =" + rn);

		System.out.println("enter name");
		name = sc.next();
		System.out.println("Name =" + name);

		int[] arr = new int[5];
		System.out.println("enter 5 subject marks");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (i = 0; i < arr.length; i++) {
			System.out.println("subject marks " + arr[i]);
		}

		int sum = 0;
		for (i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		if (sum <= 500) {
			System.out.println("Total marks = " + sum);
			int per = sum / 5;
			System.out.println("total percentage = " + per);

			if (per > 75)
				System.out.println("GRADE = A");
			else if (per < 74 && per > 60)
				System.out.println("GRADE = B");
			else
				System.out.println("GRADE = C");
		} else
			System.out.println("Wrong marks submitted ");

	}
}
