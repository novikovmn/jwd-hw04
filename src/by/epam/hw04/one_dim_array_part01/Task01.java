package by.epam.hw04.one_dim_array_part01;

import java.util.Arrays;

/* 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. 
 */

public class Task01 {

	public static void main(String[] args) {
		
		int k = 3;
		int[] arr = { 1, 2, 3, 45, 18, 21, 27, 30, 22, 11, 120 };
		
		System.out.println("Дано: " + Arrays.toString(arr));
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % k == 0)  {
				sum += arr[i];
			}
		}
		
		System.out.printf("Сумма чисел кратных %d = %d\n", k, sum);

	}

}
