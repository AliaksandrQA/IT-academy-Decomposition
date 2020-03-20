package by.epam.course.decomposition;

import java.util.Random;

/* Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m. */

public class DecompositionTask11 {

	public static void main(String[] args) {
		
		int [] arr;
		
		int sum;
		
		arr = ArrayFullfilment(7);
		sum = ArrayCalc(arr, 3,6) ;
		
	}
	
	public static int[] ArrayFullfilment(int x)	{

		int[] temp = new int[x];

		Random random = new Random();

		for (int i = 0; i < temp.length; i++) {

			temp[i] = random.nextInt(10);
		}
		return temp;
	}
	
	public static int ArrayCalc (int [] a, int k, int m) {
		
		int sum = 0;
		for ( int i = k; i <=m; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}
