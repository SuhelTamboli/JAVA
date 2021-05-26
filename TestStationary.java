//11:Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
//1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and ColorBox is at 50 Rs.
//Calculate Total of all purchesed items.

import java.util.Scanner;

public class TestStationary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0, n, t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, Total = 0;
		boolean flag = false;

		System.out.println("choose the items you want to buy:");
		System.out.println("MENU");
		System.out.println("1.Pen 2.Pencil 3.Notebook 4.Bottle 5.Colorbox");
		while (flag != true) {
			System.out.println("enter choice ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("the price of one pen = Rs.10");
				System.out.println("Mention the quantity");
				n = sc.nextInt();
				t1 = n * 10;
				System.out.println("total cost of pen= " + t1);
				break;

			case 2:
				System.out.println("the price of one pencil = Rs.5");
				System.out.println("Mention the quantity");
				n = sc.nextInt();
				t2 = n * 5;
				System.out.println("total cost of pencil= " + t2);
				break;

			case 3:
				System.out.println("the price of one notebook = Rs.20");
				System.out.println("Mention the quantity");
				n = sc.nextInt();
				t3 = n * 20;
				System.out.println("total cost of notebook= " + t3);
				break;

			case 4:
				System.out.println("the price of one bottle = Rs.30");
				System.out.println("Mention the quantity");
				n = sc.nextInt();
				t4 = n * 30;
				System.out.println("total cost of bottle= " + t4);
				break;

			case 5:
				System.out.println("the price of one colorbox = Rs.50");
				System.out.println("Mention the quantity");
				n = sc.nextInt();
				t5 = n * 50;
				System.out.println("total cost of colorbox" + t5);
				break;

			case 6:
				flag = true;
				break;
			}

		}
		Total = t1 + t2 + t3 + t4 + t5;
		System.out.println("Total cost = " + Total);

	}
}
