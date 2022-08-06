package by.epam.hw04.one_dim_array_part01;

import java.util.Arrays;
import java.util.Random;

/* 18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить 
игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на 
передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, 
которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки. 
*/

public class Task18 {

	public static void main(String[] args) {

		int n = 10;
		int[] cells = new int[n];

		for (int i = 0; i < cells.length; i++) {
			cells[i] = new Random().nextInt(6) + 1;
		}

		System.out.println("Вставлены кубики в замок: " + (Arrays.toString(cells)));

		int flag = 0;
		for (int i = 0; i < cells.length - 2; i++) {

			int sumOfThreeCoubs = cells[i] + cells[i + 1] + cells[i + 2];

			if (sumOfThreeCoubs == 10) {
				flag++;
				System.out.printf("Кубики на позициях %d, %d и %d составляют в сумме %d. Замок открыт!)\n", i, i + 1,
						i + 2, sumOfThreeCoubs);
				break;
			}

		}

		if (flag == 0) {
			System.out.println("Замок закрыт! Комбинацию подобрать не удалось(");
		}

	}

}
