package by.epam.hw04.one_dim_array_part01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел 
несколько, то определить наименьшее из них. 
*/

public class Task19 {
	public static void main(String[] args) {

		int[] arr = { 0, 4, 1, 6 };

		System.out.println("Дано: " + Arrays.toString(arr));

		List<Integer> numbersWithLotOfMatches = new ArrayList<Integer>();

		// outer
		for (int i = 0; i < arr.length; i++) {
			int counterOfMatches = 1; // каждое число массива встречается хотя бы раз

			// inner
			for (int j = 0; j < arr.length && j != i; j++) {
				if (arr[i] == arr[j]) {
					counterOfMatches++; // если где-то еще число появится - фиксируем это
				}

				// end inner
			}

			int numberWeWantToFind = 0; // фиксируем число i с наибольшим числом появлений
			int maxMatchesNumber = 1; // допускаем, что макс-е кол-во появлений числа i равно 1
			int matchNumberCount = counterOfMatches; // фактическое кол-во вхождений числа i

			// находим то число i, которое имеет наибольшее число вхождений
			// и добавляем его в список
			if (matchNumberCount > maxMatchesNumber) {
				numberWeWantToFind = arr[i];
				numbersWithLotOfMatches.add(numberWeWantToFind);
			}
			// end outer
		}

		// удаляем дубликаты
		List<Integer> numbersWithLotOfMatchesWithoutDuplicates = numbersWithLotOfMatches.stream().distinct()
				.collect(Collectors.toList());

		// выводим итоги, в зависимости от найденных чисел
		if (numbersWithLotOfMatchesWithoutDuplicates.size() == 1) {
			System.out.printf("Число с наибольшим числом вхождений -> %d\n",
					numbersWithLotOfMatchesWithoutDuplicates.get(0));
		} else if (numbersWithLotOfMatchesWithoutDuplicates.size() > 1) {
			System.out.printf("Меньшее число с наибольшим числом вхождений -> %d\n",
					Collections.min(numbersWithLotOfMatchesWithoutDuplicates));
		} else {
			System.out.println("Повторяющихся элементов нет(");
		}

	}

}
