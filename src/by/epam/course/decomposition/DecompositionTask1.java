package by.epam.course.decomposition;

/* Треугольник задан координатами своих вершин. Написать метод для вычисления его площади. */

public class DecompositionTask1 {

	public static void main(String[] args) {
		double x1, y1; // объявление переменных 
		double x2, y2; // объявление переменных 
		double x3, y3; // объявление переменных 
		
		
		x1 = 1; // инициализация переменной
		y1 = 2; // инициализация переменной
		x2 = 6; // инициализация переменной
		y2 = 2; // инициализация переменной
		x3 = 4; // инициализация переменной
		y3 = 5; // инициализация переменной
		
		
        double c1, c2, c3;  // объявление переменных 
        
        double area; // объявление переменной
        
        
		c1 = calcTriangleHypotenuse(x1, y1, x2, y2); // вызов метода с параметрами и присваеваем результат переменной с1
		
		c2 = calcTriangleHypotenuse(x2, y2, x3, y3); // вызов метода с параметрами и присваеваем результат переменной с2
		
		c3 = calcTriangleHypotenuse(x1, y1, x3, y3); // вызов метода с параметрами и присваеваем результат переменной с3
						
		area = calcTriangleArea(c1, c2, c3); // вызов метода с параметрами и присваеваем результат переменной area
		
		System.out.print("Triangle area = " + area); 
		System.out.println();
	}
	
		
		public static double calcTriangleHypotenuse(double x1, double y1, double x2, double y2) { // метод для расчёт бизнес логики // расчёт гипотенузы 
			
			double a, b, c;
			
			a = x2 - x1;
			
			b = y2 - y1;
			
			c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			
		    return c;
		}
		
		public static double calcTrianglePerimeter(double a, double b, double c) { // метод для расчёт бизнес логики // расчёт периметра // отдельный метод который вызывается в calcTriangleArea 
			
			double perimeter;
			
			perimeter = a + b + c;
			
			return perimeter;
		}
		
		
			
		
		
		public static double calcTriangleArea(double a, double b, double c) {	// метод для расчёт бизнес логики // расчёт площади треугольника
			
			double p = calcTrianglePerimeter(a, b, c); // вызывается метод в переменную p  // исп-ся переменные с1 с2 с3 как a b c ; // + видимость в пределах блока 
			
			double semiperimeter = p/ 2;
			
			double area = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
			
			return area;
		}
		
	
	}