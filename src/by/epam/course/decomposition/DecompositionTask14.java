package by.epam.course.decomposition;

/*Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.дного и того же заданного радиуса */

public class DecompositionTask14 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int digit;

		num1 = 1234;
		num2 = 123456;
		
		int count1;
		int count2;
		int compare;
		count1 = countDigit1(num1);
		count2 = countDigit2(num2);
		compare = compareDig(num1, num2);
		print(compare);
	}

	public static int countDigit1(int a) {

		int temp = 0;

		while (a > 0) {
			a = a / 10;
			temp++;
		}
		return temp;
	}

	public static int countDigit2(int b) {
		int temp = 0;

		while (b > 0) {
			b = b / 10;
			temp++;
		}
		return temp;
	}
	public static int compareDig(int a, int b) {
		
		int temp1, temp2;
		temp1 = countDigit1(a);
		temp2 = countDigit2(b);
		
		if (temp1 > temp2) {
			return temp1;
		} else {
			return temp2;
		}
		
		}
	public static void print(int compareDig) {
		System.out.print("Большее число содержит " + compareDig +" "+ "цифр");
	} 
} 
