package ejercicios;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String marca, modelo;
		int precio;
		int numeroVehiculos, indiceVB; // Indice del Vehiculo mas barato
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de Vehiculos");
		numeroVehiculos = sc.nextInt();
		
		// Creando una instancia de la clase Vehiculo
		Vehiculo vehiculosArray[] = new Vehiculo[numeroVehiculos];
		
		for(int i=0; i<vehiculosArray.length; i++) {
			sc.nextLine(); // consume \n
			System.out.println("\nIngrese las caracteristicas del Vehiculo" + (i+1) + ":");
			System.out.println("Introduzca la Marca:");
			marca = sc.nextLine();
			System.out.println("Introduzca el Modelo:");
			modelo = sc.nextLine();
			System.out.println("Introduzca el Precio: ");
			precio = sc.nextInt();
			
			// Asignarle los objetos creados al arreglo vehiculosArray
			vehiculosArray[i] = new Vehiculo(marca, modelo, precio);
		} // fin del for
		
		// llegado a este punto ya tenemos nuestro ARRAY con objetos de tipo Vehiculo
		indiceVB = indiceVehiculoMasBarato(vehiculosArray);
	
		// Presentar información al Usuario
		System.out.println("\nEl Vehiculo mas barato es: ");
		System.out.println(vehiculosArray[indiceVB].mostrarDatos());

	} // final del metodo main
	
	public static int indiceVehiculoMasBarato(Vehiculo vehiculo[]) {
		int precio;
		int indice = 0;
		// Asignamos a precio el primer elemento de vehiculo
		precio = vehiculo[0].getPrecio();
		
		// 700 800 100
		for(int i=1; i< vehiculo.length; i++) {
			if(vehiculo[i].getPrecio() < precio) {
				precio = vehiculo[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}

} // fin de la clase Principal
