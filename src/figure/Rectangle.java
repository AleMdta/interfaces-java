package figure;

//En esta clse se va a heredar el atributo de la clase abstracta figura y se va a sobreescribir


//1. Aplicamos herencia en nuestra clase
public class Rectangle extends Figure{
	
	//Parámetros
	double height;
	double width;
	
	//Constructor
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	//Métodos
	@Override
	public double calcularArea() {
	
		double rectagleFormula = height * width;
		return rectagleFormula;
	}

}
