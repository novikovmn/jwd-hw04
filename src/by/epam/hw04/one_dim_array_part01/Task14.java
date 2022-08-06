package by.epam.hw04.one_dim_array_part01;

import java.util.Arrays;

/* 14. дан одномерный массив a[n]. найти max(a2, a4 ... a2k) +  min(a, a3 ... a2k+1) */

public class Task14 {

	public static void main(String[] args) {
		int[] arr = { 5, 11, 41, 86, 3, 2, 1, 4, 6 };
		
		System.out.println("Дано: " + Arrays.toString(arr));
		
		int maxEven = 2;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0 && arr[i] > maxEven) {
				maxEven = arr[i];
			}
		}
		
		int minOdd = 1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0 && arr[i] < minOdd) {
				minOdd = arr[i];
			}
		}
		
		System.out.printf("Max четное число = %d\n", maxEven);
		System.out.printf("Min не четное число = %d\n", minOdd);
		System.out.printf("Их сумма = %d", minOdd + maxEven);
		

	}

}
