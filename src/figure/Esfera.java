package figure;

//Esto es una CLASE CONCRETA que implementa métodos de una interfaz llamada calculable
public class Esfera implements Calculable {
	double radio;
	double pi;

	@Override
	public double calcularArea() {
		double area = (4*pi) *(radio*radio); 
		return area;
	}

	@Override
	public double calcularVolumen() {
		double volumen = (4/3)*(pi*radio*radio*radio);
		return volumen;
	}

	@Override
	public double calcularPerimetro() {
		
		return 0;
	}
	
	

}
