package by.epam.course.decomposition;

/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника. */

public class DecompositionTask6 {

	public static void main(String[] args) {
		double a;
		
		a = 7;
		
		double hexagon;
		double triangle;
		
		triangle = calcTriangle(a);
		hexagon = calcHex(a);
		
	System.out.println("Hexagon's square with a side = "+" "+ hexagon );
	System.out.println();
		
		
		
	}
		
	public static double calcTriangle(double a) {
		
		double area;
		
		area =  (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		return area;
	}
	
	public static double calcHex( double a) {
		
		double hex, temp;
		
		temp = calcTriangle(a);
		hex = temp * 6;
		return hex;
		
		
		
		
	}
	
}
