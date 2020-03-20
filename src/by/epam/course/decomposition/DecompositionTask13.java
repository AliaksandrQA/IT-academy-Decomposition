package by.epam.course.decomposition;

/*Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются
цифры числа N. */

public class DecompositionTask13 {

	public static void main(String[] args) {
		
		int number;
		
		number = 123456;
		
		int [] arr;
		
		arr = numberArr(number);
		printArray(arr);
		
		
	}
	
	public static int findArrNumber(int x) {
		int y = 0;
		int temp;
		temp = x;
		
		while (temp > 0) {
			
			temp = temp / 10;
			y++;
		}
		return y;
		
	}
	
	public static int [] numberArr ( int x) {
		
		int temp;
		
		temp = findArrNumber(x);
		
		int [] arrTemp = new int [temp];
		
		for ( int i = arrTemp.length  - 1; i >=0; i--) {
			
			arrTemp[i] = x % 10;
			
			x = x / 10;
			
		}
		return arrTemp;
	}
	public static void printArray( int [] arr) {
		
		for (int i : arr) {
			System.out.print(i);
			
		}
	}
	
	
	
}
