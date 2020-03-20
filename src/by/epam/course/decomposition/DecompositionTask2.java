package by.epam.course.decomposition;

/* 2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: НОК(A,B) = A * B/ НОД(A,B)  */

public class DecompositionTask2 {

	public static void main(String[] args) {
		double x; // объявление переменных
		double y; // объявление переменных

		x = 30; // инициализация переменной
		y = 18; // инициализация переменной

		double x1 = mymin(x, y);
		double x2 = mymax(x, y);
		

		double great = greatCom(x, y);
		System.out.println("Значение наибольшего общего делителя = "+ great);
		double less = leastCom(x, y);
		System.out.println("Значение наименьшего общего кратного двух = "+ less);
		

	}

	public static double mymin(double a, double b) {

		double x = Math.min(a, b);
		return x;
	}

	public static double mymax(double a, double b) {
		double x = Math.max(a, b);
		return x;
	}

	public static double greatCom(double a, double b) {
		double n = mymin(a, b);
		double max;
		max = 1;
		for (int i = 1; i <= n; i++) {
			if (a % i == 0 && b % i == 0) {
				max = mymax(i, max);
			} else {
			}
			;
		}
		return max;

	}

	public static double leastCom(double a, double b) {
		double n = greatCom(a, b);
		double resultat = a * b / n;
		return resultat;
	}
}
