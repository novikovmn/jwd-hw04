package by.epam.hw04.one_dim_arrays_part01;

import java.util.Arrays;

/* 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности. 
Если таких чисел нет, то вывести сообщение об этом факте. 
 */

public class Task05 {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 56, 8, 31, 10, 11, 4, 8, 15, 16, 122 };
		
		System.out.println("Дано: " + Arrays.toString(arr));

		int countEvenNumbers = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				countEvenNumbers++;
			}
		}
		
		if(countEvenNumbers == 0) {
			System.out.println("Четных чисел нет!");
		}else {
			int[] evenNumbers = new int[countEvenNumbers];
			for (int i = 0, j = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 0) {
					evenNumbers[j++] = arr[i];
				}
			}
			System.out.println("Массив из четных чисел исходного массива: " + Arrays.toString(evenNumbers));
		}
	
	}

}
