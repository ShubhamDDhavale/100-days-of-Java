package com.my.QueueTester;

import com.my.QueueExceptions.QueueIsEmptyException;
import com.my.QueueExceptions.QueueIsFullException;
import com.my.QueueUtils.Queue;
import java.util.Scanner;

public class QueueTester {

	public static void main(String[] args) {
		int choice;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the no of elemnts");
			int n = scanner.nextInt();
			scanner.nextLine();
			Queue<Integer> numbers = new Queue<>(n);

			do {
				System.out.println("Enter the function you want to do" + "\n1. Add a number" + "\n2. Remove a number"
						+ "\n3. Show all numbers" + "\n0. exit");
				choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {

				case 1: {
					System.out.println("Enter a number");
					int number = scanner.nextInt();
					scanner.nextLine();

					try {
						numbers.addlast(number);
					} catch (QueueIsFullException e) {
						System.out.println(e.getMessage());
					}
				}
					break;

				case 2: {

					try {

						int deleted = numbers.removeFirst();

						System.out.println(deleted + "is removed");
					} catch (QueueIsEmptyException e) {
						System.out.println(e.getMessage());

					}

				}
					break;

				case 3: {
					System.out.println("Cuurent list:");
					System.out.println(numbers);
					numbers.printQueue(n);

				}
					break;
				case 0: {
					System.out.println("Exiting the program");
					System.exit(0);

				}
					break;
				default: {
					System.err.println("Invalid choice!!");
				}
				}

			} while (choice != 0);
		}
	}
}
