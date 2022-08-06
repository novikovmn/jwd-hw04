package by.epam.hw04.one_dim_array_part01;

import java.util.Arrays;

/* 20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент 
(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать. 
*/

public class Task20 {

	public static void main(String[] args) {

		int[] arr = { 5, 11, 41, 86, 3, 2, 1, 4, 1, 6 };

		System.out.println("Дано: " + Arrays.toString(arr));
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				arr[i] = 0;
			}
		}

		System.out.println("Выбросили каждый второй элемент: " + Arrays.toString(arr));
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] == 0 && arr[j + 1] != 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

		System.out.println("Результат: " + Arrays.toString(arr));

	}

}
