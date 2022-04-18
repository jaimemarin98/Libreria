package es.indra.principal;

public class Articulo extends Producto{
	public Articulo(String nombre, String autor, String editorial, double precio, int cantidad) {
		super("Libro", nombre, autor, editorial, precio, cantidad);
	}
}
