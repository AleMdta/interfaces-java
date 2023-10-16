package figure;

public class Circle extends Figure {
	//1. Atributos
	double radio;
	double pi;
	
	//2. Constructor
	public Circle(double radio, double pi) {
		this.radio = radio;
		this.pi = pi;
	}

	//3.Métodos	
	@Override
	public double calcularArea() {
		double area = pi * (radio*radio);
		return area;
	}
	
	
	

}
