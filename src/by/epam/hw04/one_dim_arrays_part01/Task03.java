package by.epam.hw04.one_dim_arrays_part01;

import java.util.Arrays;

/* 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или 
отрицательное. 
 */

public class Task03 {

	public static void main(String[] args) {

		int[] arr = { -1, 3, 18, 21, 30, 11, 120 };
		
		System.out.println("Дано: " + Arrays.toString(arr));
		
		int indexOfNegativeElem = -1;
		int indexOfPositiveElem = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				indexOfPositiveElem = i;
				break;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				indexOfNegativeElem = i;
				break;
			}
		}
		
		if(indexOfNegativeElem < indexOfPositiveElem) {
			System.out.println("Отрицательное число встретилось раньше.");
		}else {
			System.out.println("Положительное число встретилось раньше.");
		}

		
	}

}
