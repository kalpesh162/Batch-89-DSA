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
		quickSort(arr, 0, arr.length - 1);
		long endTime = System.currentTimeMillis();
		System.out.println("******  AFTER SORT  DISPLAY ********");
		display(arr);

		System.out.println("  TIME TAKE BY   " + (endTime - startTime) + "  ms");
	}

	private static void quickSort(int[] arr, int p, int r) {

		if (p < r) {
			int q = partition(arr, p, r);
			// System.out.println("merge( a , " + p + " , " + r + " )");
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);

		}
		// System.out.println("merge( a , " + p + " , " + r + " )");

	}

	private static int partition(int[] arr, int p, int r) {
		int pivot = arr[r];
		int i = p - 1;

		for (int j = p; j < r; j++) {

			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = temp;

		return i + 1;
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
