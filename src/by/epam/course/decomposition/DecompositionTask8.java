package by.epam.course.decomposition;

import java.util.Random;

/* Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).*/

public class DecompositionTask8 {

	public static void main(String[] args) {

		int x = 10;

		int[] arr;

		arr = fullfillArray(x); // вызываю fullfillArray// передаю значение x в метод fullfillArray и возвращаю
								// результат в arr;

		int maxArrayVal = maxDigit(arr); // вызываю метод maxDigit // передаю рандомные значения которые были вызваны и
											// присвоены ранее;

		int maxArrayVa2 = maxDigit2(arr, maxArrayVal);// вызываю метод maxDigit2 // передаю рандомные значения arr'a +
														// maxArrayVal;

		System.out.println("Второе по величине число" + " " + maxArrayVa2);
		
	}

	public static int[] fullfillArray(int a) { // метод для наполнения массива рандомными значения

		Random random = new Random(); // объект рандом

		int[] temp = new int[a]; // временный массив который заполняется рандомными значения

		for (int i = 0; i < temp.length; i++) { // цикл для заполнения
			temp[i] = random.nextInt(10);
		}
		return temp;
	}

	public static int maxDigit(int[] a) { // метод для нахождения большего из рандомных чисел // передаю методу массив
											// arr

		int max = a[0]; // max равна значению элемента с индексом [0]//

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) { // какой либо a[i] элемент больше max

				max = a[i]; // присвой значение этого a[i] элемента переменной max;
			}

		}
		return max;

	}

	public static int maxDigit2(int[] a, int prevMax) {

		int secMax = a[0];

		int j = 1;

		while (secMax == prevMax) {
			secMax = a[j];
			j++;
		}

		for (int i = 0; i < a.length; i++) {
			secMax = a[i];
		}
		return secMax;

	}

}
