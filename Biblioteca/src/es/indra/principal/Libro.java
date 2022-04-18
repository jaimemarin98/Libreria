package es.indra.principal;

public class Libro extends Producto{
	public Libro(String nombre, String autor, String editorial, double precio, int cantidad) {
		super("Libro", nombre, autor, editorial, precio, cantidad);
	}
}
