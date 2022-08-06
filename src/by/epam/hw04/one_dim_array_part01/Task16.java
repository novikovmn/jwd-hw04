package by.epam.hw04.one_dim_array_part01;

/* 16.  Даны действительные числа а1, а2, ..., а2n. Найти  max(a1 + a2n, a2 + a2n-1, ..., аn + an+1).
 * 
 * 		Пояснение: 
 * 				1)a2n - это последний элемент;
 * 				2)2n - означает, что массив будет четной длины(всегда);
 * 				3) Нужно складывать 1й и послед элементы, 2й и предпосл и т.д. следуя в цикле до середины массива.
 * 				4) Найти макс среди таких сумм
 * 
 * */

public class Task16 {

	public static void main(String[] args) {

		double[] arr = { 15.0, 16.0, 17.0, 2.0, 10.0, 111.0, 31.0, 42.0 };
		
		
		double maxSum = arr[0] + arr[arr.length - 1];
		for (int i = 1; i < arr.length / 2; i++) {
			if(arr[i] + arr[arr.length - 1 - i] > maxSum) {
				maxSum = arr[i] + arr[arr.length - 1 - i];
			}
		}
		
		System.out.println("Ответ: " + maxSum);
	}

}
