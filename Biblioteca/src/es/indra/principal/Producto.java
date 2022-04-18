package es.indra.principal;

public abstract  class Producto {

	protected String tipo;
	protected String nombre;
	protected String autor;
	protected String editorial;
	protected double precio;
	protected int cantidad;
	
	public Producto(String tipo, String nombre, String autor, String editorial, double precio, int cantidad) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombrePro(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void ListadoProd() {
		System.out.println("\n Tipo: " + tipo);
		System.out.println("\n Nombre: " + nombre);
		System.out.println("\n Autor: " + autor);
		System.out.println("\n Editorial: " + editorial);
		System.out.println("\n Precio: " + precio);
		System.out.println("\n Cantidad: " + cantidad + "\n");
	}
	
}
