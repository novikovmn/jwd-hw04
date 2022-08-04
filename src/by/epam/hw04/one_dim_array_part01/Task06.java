package by.epam.hw04.one_dim_arrays_part01;

import java.util.Arrays;

/* 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа. 

 * ПОЯСНЕНИЕ: найти |max эл - min эл|
 */

public class Task06 {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 56, 8, 31, 10, 11, 4, 8, 15, 16, 122 };

		System.out.println("Дано: " + Arrays.toString(arr));

		System.out.printf("Наименьшая длина числовой оси = %d", findSolution(arr));

	}

	public static int findSolution(int[] arr) {

		int minElem = findMinElem(arr);
		int maxElem = findMaxElem(arr);

		return (int) Math.abs(maxElem - minElem);

	}

	public static int findMaxElem(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findMinElem(int[] arr) {
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

}
