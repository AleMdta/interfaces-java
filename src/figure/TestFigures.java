package figure;

//Clase para testear nuestras clases
public class TestFigures {

	public static void main(String[] args) {
		
		//Generar las intancias de las clases
		
		//Instancia de la clase figura
		//Figure generic = new Figure();
		
		//Instancia de un rectángulo
		Figure myRectangle = new Rectangle(6, 9);
		Figure myCircle = new Circle(9.5, 3.1416);
		
		//Invocaión del método
		System.out.println(myRectangle.calcularArea());
		System.out.println(myCircle.calcularArea());
		
		

	}

}
