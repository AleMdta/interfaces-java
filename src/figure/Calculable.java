package figure;


//Utilizando INTERFACES
public interface Calculable {
	//Área, volumen y perímetro de un prisma
	
	//Métodos de la interface
	//Solo tengo las invocaciones de las funciones (me dice qué debe hacer pero no cómo)
	double calcularArea();
	double calcularVolumen();//Estos son métodos abtractos
	double calcularPerimetro();
	//Estos métodos aplican para cualquier prisma, lo que va a cambiar es la fórmula para hacer el cálculo
	

}
