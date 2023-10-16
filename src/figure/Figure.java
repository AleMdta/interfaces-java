package figure;


//Uso de clases abstractas para evitar la instanciación de objetos que no necesito
//Suelen ser objetos muy abstractos(figura, persona, animal) - poco específicos


//Para que una clase se vuelva abstarcta, se utiliza la palbra reservada "abstract"
public abstract class Figure {
	
	//Declaración de método abstracto (sin cuerpo, solo la firma del método)
	public abstract double calcularArea(); //Este método nos dice qué hacer, pero no nos dice cómo (se que debo obtener el área de una figura pero no sé cuál será la formula, ya que dependerá del tipo de figura, circulo, cuadrado, triángulo)
	

}

/*
 * Las Clases Abstractas pierden la capacidad de instanciar
 * Necesitas métodos abstarctos, no tiene cuerpo, solo tiene la cabeza(firma del métodos- modificador de acceso, tipo de dato, nombre y parámetros)
 * Cuando se usan las clases abstractas, es obligatorio utilizar todos los métodos abtractos
 */
