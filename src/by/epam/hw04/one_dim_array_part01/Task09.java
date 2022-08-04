package by.epam.hw04.one_dim_arrays_part01;

/*9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы*/

import java.util.Arrays;

public class Task09 {

	public static void main(String[] args) {
		double[] arr = { 31, 10, -111, 4, 8, 15, 16, 122.31 };
		System.out.println("Дано: " + Arrays.toString(arr));
		
		int maxIndex = findMaxIndex(arr);
		int minIndex = findMinIndex(arr);
		
		System.out.println("max index = " + maxIndex);
		System.out.println("min index = " + minIndex);

		double temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		
		System.out.println("Итог: " + Arrays.toString(arr));
	}

	public static int findMinIndex(double[] arr) {
		double minElem = arr[0];
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minElem) {
				minElem = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static int findMaxIndex(double[] arr) {
		double maxElem = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxElem) {
				maxElem = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
