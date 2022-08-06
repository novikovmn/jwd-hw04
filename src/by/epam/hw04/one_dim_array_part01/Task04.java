package by.epam.hw04.one_dim_array_part01;

import java.util.Arrays;

/*4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей. */

public class Task04 {

	public static void main(String[] args) {

		double[] arr = { -1.0, 0.1, 18.0, 0.31, 4.5, 65.0, -111.35 };

		System.out.println("Дано: " + Arrays.toString(arr));

		int counter = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				counter++;
			}
		}

		if (counter == arr.length - 1) {
			System.out.println("Последовательность возрастающая!");
		} else {
			System.out.println("Последовательность НЕ возрастающая!");
		}

	}

}
