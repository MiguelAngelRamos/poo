package ejercicios;

public class Vehiculo {
	// private solo es accesible dentro de la clase (Vehiculo)
	private String marca;
	private String modelo;
	private float precio;
	
	public Vehiculo(String marca, String modelo, float precio) {
		// super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	// por medio del metodo de acceso publico retorno el contenido de la variable private precio
	public float getPrecio() {
		return precio;
	}

	//@Override
	// public String toString() {
	//	return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	//}
	
	public String mostrarDatos() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: $" + precio + "\n";
	}
	


	
}
