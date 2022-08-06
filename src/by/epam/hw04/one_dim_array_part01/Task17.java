package by.epam.hw04.one_dim_array_part01;

import java.util.Arrays;

/*  
17. Дана последовательность целых чисел  a1,a2 ... an. Образовать новую последовательность, выбросив из исходной 
те члены, которые равны  min(a1,a2 ... an). 
 */

public class Task17 {

	public static void main(String[] args) {

		int[] arr = { 15, 2, 17, 2, 6, 18, 2, 31, 42 };
		
		System.out.println("Дано: " + Arrays.toString(arr));

		int min = Arrays.stream(arr).min().getAsInt();
		
		int countMin = 0;	
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == min) {
				countMin++;
			}
		}
		
		int[] withoutMin = new int[arr.length - countMin];
		
		for (int i = 0, j = 0; i < arr.length; i++) {
			if(arr[i] != min) {
				withoutMin[j++] = arr[i];
			}
		}
		
		System.out.println("Итог: " + Arrays.toString(withoutMin));

	}

	

}
