package p1;

import java.util.Random;
import java.util.Scanner;

public class App01 {

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size");
		size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("******INPUT ********");
		inputArray(arr);
		System.out.println("******INPUT  DONE********");

		System.out.println("******  DISPLAY ********");
		display(arr);
		System.out.println("******  DISPLAY  DONE********");

		long startTime = System.currentTimeMillis();
		insertionSort(arr);
		long endTime = System.currentTimeMillis();
		System.out.println("******  AFTER SORT  DISPLAY ********");
		display(arr);

		System.out.println("  TIME TAKE BY   " + (endTime - startTime) + "  ms");
	}

	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;

		}

	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%-8d   %-10d  \n", i, arr[i]);
		}

	}

	private static void inputArray(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt();
	}

}
