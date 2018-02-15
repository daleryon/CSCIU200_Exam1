package examnbone;

import java.util.Scanner;

public class Room {

	public static void main(String[] args) {

		int length, width, height;
		double gallons, gal;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the length of the room: ");
		length = scan.nextInt();

		System.out.print("Enter the width of the room: ");
		width = scan.nextInt();

		System.out.print("Enter the height of the room: ");
		height = scan.nextInt();

		scan.close();

		gal = (350 / 3);

		System.out.println("How much paint: " + gal);
	}

}
