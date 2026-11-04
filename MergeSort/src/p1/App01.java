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
		mergeSort(arr, 0, arr.length - 1);
		long endTime = System.currentTimeMillis();
		System.out.println("******  AFTER SORT  DISPLAY ********");
		display(arr);

		System.out.println("  TIME TAKE BY   " + (endTime - startTime) + "  ms");
	}

	private static void mergeSort(int[] arr, int p, int r) {
		int q;

		if (p < r) {
			q = (p + r) / 2;
			//System.out.println("merge( a , " + p + " , " + r + " )");
			mergeSort(arr, p, q);
			mergeSort(arr, q + 1, r);
			// merge_proc
			merge_proc(arr, p, q, r);

		}
		//System.out.println("merge( a , " + p + " , " + r + " )");

	}

	private static void merge_proc(int[] arr, int p, int q, int r) {
		// get lenght of 2 Array
		int N1 = q - p + 1;
		int N2 = r - q;

		// Create an Array
		int a1[] = new int[N1];
		int a2[] = new int[N2];

		// fill a1 array
		for (int i = 0; i < N1; i++)
			a1[i] = arr[p + i];

		// fill a2 array
		for (int j = 0; j < N2; j++)
			a2[j] = arr[q + 1 + j];

		int i = 0;
		int j = 0;
		int k = 0;

		while (true) {

			if (a1[i] < a2[j]) {
				arr[p + k] = a1[i];
				i++;
				k++;

				if (i == N1) {
					while (j < N2) {
						arr[p + k] = a2[j];
						j++;
						k++;
					}
					break;
				}

			} else {

				arr[p + k] = a2[j];
				j++;
				k++;

				if (j == N2) {
					while (i < N1) {
						arr[p + k] = a1[i];
						i++;
						k++;
					}

					break;
				}

			}

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
