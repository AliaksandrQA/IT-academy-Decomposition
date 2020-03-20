package by.epam.course.decomposition;

/*Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел. */

public class DecompositionTask4 {

	public static void main(String[] args) {

		double x; // объявление переменных
		double y; // объявление переменных
		double z; // объявление переменных

		x = 22;
		y = 34;
		z = 48;

		double lesscom2;
		double lesscom3;
		
		lesscom2 = lessCom(x,y);
		lesscom3 = lessCom(lesscom2,z);
		
		System.out.println("Наименьшее общее кратное трех чисел = " + lesscom3);

	}

	public static double myMin(double a, double b) {

		double x = Math.min(a, b);
		return x;
	}

	public static double myMax(double a, double b) {
		double x = Math.max(a, b);
		return x;
	}

	public static double greatCom(double a, double b) {
		double n = myMin(a, b);
		double max;

		max = 1;

		for (int i = 1; i <= n; i++) {
			if (a % i == 0 && b % i == 0) {
				max = myMax(i, max);
			} else {
			}
			;
		}
		return max;
	}

	public static double lessCom(double a, double b) {
		double n = greatCom(a, b);
		double result = a * b / n;
		return result;
	}
}