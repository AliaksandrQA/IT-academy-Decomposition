package by.epam.course.decomposition;

/*Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел. */

public class DecompositionTask3 {


	public static void main(String[] args)  {
		int x; // объявление переменных
		int y; // объявление переменных
		int z;
		int q;
		
		x = 22;
		y = 34;
		z = 48;
		q = 52;
		
		int greatcom2;
		int greatcom3;
		int greatcom4;
	
		
		greatcom2 = greatCom(x,y) ;
		greatcom3 = greatCom(greatcom2,z);
		greatcom4 = greatCom(greatcom3,q);
		System.out.println("Значения общего делителя четырех натуральных чисел"+" "+ greatcom2 + greatcom3 + greatcom4 );
		
	}

	public static int myMin(int a, int b) {

		int x = Math.min(a, b);
		return x;
	}

	public static int myMax(int a, int b) {
		int x = Math.max(a, b);
		return x;
	}

	

	public static int greatCom ( int a , int b) {
		int n = myMin(a, b);
		int max;
		max = 1;
		for ( int i = 1; i <= n; i++) {
			if ( a % i == 0 && b % i ==0) {
				max = myMax(i,max);
			}
			else {};
		} return max;
		
	} 
}
