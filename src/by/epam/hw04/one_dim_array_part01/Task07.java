package by.epam.hw04.one_dim_arrays_part01;

/*7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. 
Подсчитать количество замен.*/

import java.util.Arrays;

public class Task07 {

	public static void main(String[] args) {

		double[] arr = { 1.01, 4.2, 56, 8, 31, 10, 11.231, 4, 8, 15.3, 16, 122 };
		System.out.println("Дано: " + Arrays.toString(arr));

		double z = 3.0;

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				counter++;
			}
		}

		System.out.println("Итог: " + Arrays.toString(arr));
		System.out.println("Количество замен = " + counter);

	}

}
