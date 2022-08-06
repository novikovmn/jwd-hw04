package by.epam.hw04.one_dim_array_part01;

import java.util.Arrays;


/* 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.  */

public class Task10 {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 3, 0, 18, 21, 0, 30, 0, 11, 120 };

		System.out.println("Дано: " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > i) {
				System.out.println(arr[i] + " > " + i);
			}
		}

	}

}
