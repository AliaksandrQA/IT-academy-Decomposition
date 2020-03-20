package by.epam.course.decomposition;

/*9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми. */

public class DecompositionTask9 {

	public static void main(String[] args) {
		int a, b, c;

		a = 3;
		b = 7;
		c = 12;

		int greatComm = greatCommCount(a,b,c) ;
		boolean res = resCount(greatComm); 
		printRes(res);
	}

	public static int minVal(int a, int b, int c) {
		int min;

		if (a < b && a < c) {
			min = a;
		}
		if (b < c && b < a) {
			min = b;
		} else {
			min = c;
		}
		return min;
	}

	public static int maxVal(int a, int b) {
		int max;

		if (a > b) {
			max = a;
		}

		else {
			max = b;
		}

		return max;
	}

	public static int greatCommCount(int a, int b, int c) {
		
		int temp = minVal( a, b, c);
		int max = 1;
		
		for (int i = 1; i <= temp; i++) {
			if(a % i == 0 && b % i == 0 && c % i == 0) {
				max = maxVal(i, max);
			}
		} return max;
	} 
	
 	 public static boolean resCount(int greatCommCount ) {
 		 
 		 boolean temp;
 		 if(greatCommCount == 1) {
 			 temp = true;
 		 } else {
 			temp = false;
 		 }
 		 return temp;
 	 }
 	 
 	 
 	 public static void printRes(boolean resCount) {
 		 
 		 if (resCount == true) {
 			 System.out.print("Числа являются взаимно простыми");
 		 } else {
 			 System.out.print("Числа не являются взаимно простыми");
 		 }
 	 }
} 

