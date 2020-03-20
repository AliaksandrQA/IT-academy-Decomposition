package by.epam.course.decomposition;

/* Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.*/

public class DecompositionTask10 {

	public static void main(String[] args) {
		int x;
		int result;

		x = 9;
		result = sumDigit(x);
		print(result);
	}

	public static int calcFAct(int a) {

		int temp = 1;
		for (int i = 2; i <= a; i++) {
			temp = temp * i;
		}
		return temp;
	}

	public static boolean ifOdd(int a) {

		boolean odd;

		if (a == 0) {
			odd = false;
		} else {
			odd = true;
		}
		return odd;
	}

	public static int sumDigit(int a) {

		int sum = 0;
		int temp;

		for (int i = 1; i <= a; i++) {
			if (ifOdd(i)) {
				temp = calcFAct(i);

				sum = sum + temp;
			}
		}
		return sum;
	}

	public static void print(int sumDigit) {
		System.out.println("суммы факториалов всех нечетных чисел от 1 до 9 ="+" " + sumDigit);

	}
}
