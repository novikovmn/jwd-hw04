package by.epam.hw04.one_dim_array_part01;

/* 8.  Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных, 
положительных и нулевых элементов. */

import java.util.Arrays;

public class Task08 {

	public static void main(String[] args) {

		double[] arr = { 0, -4.2, 56, 8, -31, 10, 11.231, 4, -8, 0, 0, 122 };
		System.out.println("Дано: " + Arrays.toString(arr));

		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countZero++;
			}

			if (arr[i] < 0) {
				countNegative++;
			}

			if (arr[i] > 0) {
				countPositive++;
			}
		}
		
		System.out.printf("Положительных элементов = %d\n", countPositive);
		System.out.printf("Отрицательных элементов = %d\n", countNegative);
		System.out.printf("Нулевых элементов = %d\n", countZero);

	}

}
