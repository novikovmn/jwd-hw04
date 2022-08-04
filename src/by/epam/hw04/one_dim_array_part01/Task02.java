package by.epam.hw04.one_dim_arrays_part01;

import java.util.Arrays;

/* 
2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.*/

public class Task02 {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 3, 0, 18, 21, 0, 30, 0, 11, 120 };

		System.out.println("Дано: " + Arrays.toString(arr));

		int countZeroElem = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countZeroElem++;
			}
		}

		int[] arrayWithZeroElemIndexes = new int[countZeroElem];

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arrayWithZeroElemIndexes[j++] = i;
			}
		}

		System.out.println("Индексы нулевых элементов: " + Arrays.toString(arrayWithZeroElemIndexes));

	}

}
