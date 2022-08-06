package by.epam.hw04.one_dim_array_part01;

import java.util.Arrays;

/* 
15. Дана последовательность действительных чисел a1,a2 ... an . Указать те ее элементы, которые принадлежат отрезку 
[с, d].*/

public class Task15 {

	public static void main(String[] args) {

		double c = -2.0;
		double d = 2.0;

		double[] arr = { 0.1, 3.0, -1.3, 5.0, -2.21, 1.01, 2.5 };
		
		System.out.print("Дано: " + Arrays.toString(arr) + "\n\n");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= c && arr[i] <= d) {
				System.out.printf("Элемент \"%.2f\" принадлежит отрезку [%.0f;%.0f]\n", arr[i], c, d);

			}
		}
	}

}
