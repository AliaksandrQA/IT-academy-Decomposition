package by.epam.course.decomposition;

/*Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел. */

public class DecompositionTask5 {

	public static void main(String[] args) {
		int a, b, c;

		a = 14;
		b = 48;
		c = 7;

		int count1;
		int count2;
		int total;

		count1 = sumMax(a, b, c);
		count2 = sumMin(a, b, c);
		total = TotalSum(a, b, c);
		System.out.println("Сумма большего и меньшего из трех чисел = "+" "+ total);
		

	}

	public static int sumMax(int a, int b, int c) {

		int max;

		max = Math.max(Math.max(a, b), c);

		return max;

	}

	public static int sumMin(int a, int b, int c) {

		int min;

		min = Math.min(Math.max(a, b), c);
		return min;

	}

	public static int TotalSum(int a, int b, int c) {

		int temp, max, min;

		max = sumMax(a, b, c);
		min = sumMin(a, b, c);
		
		temp = max + min;
		return temp;

	}

}