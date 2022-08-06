package by.epam.hw04.one_dim_array_part01;

import java.util.Arrays;

/*13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в 
промежутке от L до N.*/

public class Task13 {

	public static void main(String[] args) {

		int m = 3;
		int l = 10;
		int n = 60;

		int[] arr = { 1, 3, 4, 9, 18, 6, 45, 120, 60 };
		
		System.out.println("Дана последовательность: " + Arrays.toString(arr));

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] >= l && arr[i] <= n) && arr[i] % m == 0) {
				counter++;
			}
		}

		System.out.printf("Количество элементов, кратных %d и находящихся в промежутке от %d до %d = %d.\n", m, l, n,
				counter);

	}

}
