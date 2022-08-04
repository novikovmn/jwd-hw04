package by.epam.hw04.one_dim_arrays_part01;

import java.util.Arrays;

/*11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1). 
*/

public class Task11 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 18, 21, 30, 11, 120 };
		int m = 4;

		System.out.println("Дано: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			int remainder = arr[i] % m;
			if (remainder > 0 && remainder < m - 1) {
				System.out.println(arr[i]);
			}
		}

	}

}
