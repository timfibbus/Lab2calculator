import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double length = 0;
		double width = 0;
		double height = 0;

		String yesNo;
		boolean keepGoing = true;

		while (keepGoing) {

			System.out.println("Enter length: ");
			length = scan.nextDouble();
			scan.nextLine();

			System.out.println("Enter width:");
			width = scan.nextDouble();
			scan.nextLine();

			System.out.println("Enter height: ");
			height = scan.nextDouble();
			scan.nextLine();

			double area = length * width;
			double volume = area * height;
			double perimeter = (length*2)+(width*2);

			System.out.println("The perimeter of the beautiful room is " + perimeter + " units.");
			
			System.out.println("The area of the beautiful room is " + area + " units squared.");
			
			System.out.println("The volume of the beautiful room is " + volume + " units cubed.");

			System.out.println("Would you like to keep measuring rooms? It is a lot of fun after all. (y/n)");

			yesNo = scan.next();

			if (yesNo.startsWith("y")) {
				keepGoing = true;
			} else {
				keepGoing = false;
			}

		}
		

		System.out.println("Goodbye!");

		scan.close();

	}
}
