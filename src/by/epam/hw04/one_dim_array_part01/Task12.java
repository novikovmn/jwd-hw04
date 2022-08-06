package by.epam.hw04.one_dim_array_part01;

/*12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются 
простыми числами. 
*/

public class Task12 {

	public static void main(String[] args) {

		double[] arr = { 1.01, 4.2, 56, 8, 31, 10, 11.231, 4, 8, 15.3, 16, 122 };

		double sum = 0;

		for (int i = 2; i < arr.length; i++) {
			if (isPrime(i)) {
				System.out.println("[" + i + "] -> " + arr[i]);
				sum += arr[i];
			}
		}

		System.out.println("Сумма = " + sum);

	}

	public static boolean isPrime(int index) {

		int delimeter = 2;
		int flag = 0;

		while (true) {
			if (index % delimeter == 0 && delimeter != index) {
				flag++;
			}

			if (flag == 0) {
				return true;
			} else {
				break;
			}

		}

		return false;

	}

}
