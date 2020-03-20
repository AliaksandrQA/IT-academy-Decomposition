package by.epam.course.decomposition;

/*12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой. */



public class DecompositionTask12 {

	public static void main(String[] args) {
		
		double a, b , c, d;
		double hypot;
		
		
		a = 3;
		b = 4;
		c = 7;
		d = 9;
		
	double rightTriangle;
	double areaTriangle;
	double rectArea;
	
	hypot = calcHypot(a,b);
	
	rightTriangle = calcRightTriangleArea(a,b);
	
	areaTriangle = calcTriangleArea(c,d,hypot);
	
	rectArea = calcSquareTriangle(rightTriangle,areaTriangle) ;
	
	System.out.println("Площадь тркугольника"+" "+ rectArea);
	
	}

	public static double calcHypot(double x, double y) {
		
		double temp;
		
		temp = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
		
		return temp;
	}
	
	public static double calcPerimetr(double x, double y, double z) {
		
		
		double temp;
		
		temp = x + y + z;
		
		return temp;
	}
	
	public static double calcRightTriangleArea( double x, double y) {
		
		double temp;
		
		temp = 0.5 * x * y;
		
		return temp;
	}
	
	public static double calcTriangleArea(double x, double y, double z) {
		
		double halfperim, temp;
		
		halfperim = calcPerimetr(x,y,z) / 2;
		
		temp = Math.sqrt(halfperim*(halfperim - x)*(halfperim - y) * (halfperim - z));
		
		return temp;
	}
	
	public static double calcSquareTriangle(double areaTriangle1, double areaTriangle2 ) {
		
		double temp;
		
		temp = areaTriangle1 + areaTriangle2;
		
		return temp;
		
	}
	
	
	
	
	
}
