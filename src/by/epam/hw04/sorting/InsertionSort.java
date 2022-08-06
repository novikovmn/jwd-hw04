package by.epam.hw04.sorting;

import java.util.Arrays;

/* Реализовать алгоритм сортировки вставками.*/

public class InsertionSort {
	public static void main(String[] args) {
		
		int[] arr = { 5, 89, 5, -4, 0, 56, 3, 2, 6, -9 };
		
		System.out.println("Дано: " + Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			int unsortedElement = arr[i];
			int j = i;

			while (j > 0 && unsortedElement < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}

			arr[j] = unsortedElement;

		}

		System.out.println("Итог: " + Arrays.toString(arr));
		
	}
}
