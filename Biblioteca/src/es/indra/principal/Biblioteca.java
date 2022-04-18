package es.indra.principal;

import java.util.Scanner;


public class Biblioteca {
	static Producto[] productos = new Producto[100];
	static Libro CienSoledad = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "Col", 87000d, 0);
	static Libro Coronel = new Libro("El coronel no tiene quien le escriba", "Gabriel Garcia Marquez", "Col", 36000d, 0);
	static Libro LaOdisea = new Libro("La odisea", "Homero", "Gredos", 125000d, 0);
	static Revista National = new Revista("National Geographic", "National Geographic", "National Geographic", 26000d, 0);
	static Revista Motor = new Revista("Motor", "Motor", "Motor", 15000d, 0);
	static Articulo PaperComb = new Articulo("Paper sobre combustion interna", "Anonimo", "PRO", 65000d, 0);
	static Articulo PaperPOO = new Articulo("Paper sobre programacion orientada a objetos", "Anonimo", "POO", 48000d, 0);
	
	
	
	static void menu() {
		System.out.println("\n INGRESE UNA OPCION");
		System.out.println("1 Para listar productos");
		System.out.println("2: Agregar producto");
		System.out.println("3: ingresar inventario");
		System.out.println("4: Venta producto");
		System.out.println("5: salir \n");
	}
	
	
	public static void main(String[] args) {
		productos[0] = CienSoledad;
		productos[1] = Coronel;
		productos[2] = LaOdisea;
		productos[3] = National;
		productos[4] = Motor;
		productos[5] = PaperComb;
		productos[6] = PaperPOO;
		
		
		int contadorProductos = 7;
		int S=0;
		
		while (S!=5) {
			
			menu();
			Scanner in = new Scanner(System.in);
			S = in.nextInt();
			switch(S) {
				case 1: for(int c=0; c<contadorProductos; c++) {
							System.out.println("ID: "+ c);
							productos[c].ListadoProd();
						}
						break;
				case 2: System.out.println("Tipo de producto a agregar");
						System.out.println("digite una opcion");
						System.out.println("1: Libro");
						System.out.println("2: Revista");
						System.out.println("3: Articulo");
						Scanner in2 = new Scanner(System.in);
						int tipoProduc = in2.nextInt();
						if ((tipoProduc <= 3)&&(tipoProduc>=1))
						{
							System.out.println("Digite nombre del producto");
							Scanner in3 = new Scanner(System.in);
							String nomb = in3.nextLine();
							System.out.println("Digite autor del producto");
							Scanner in4 = new Scanner(System.in);
							String aut = in4.nextLine();
							System.out.println("Digite editorial del producto");
							Scanner in5 = new Scanner(System.in);
							String edito = in5.nextLine();
							System.out.println("Digite precio del producto");
							Scanner in6 = new Scanner(System.in);
							double valor = in6.nextDouble();
							if(tipoProduc==1) {
								
								Libro lib = new Libro(nomb, aut, edito, valor, 0);
								productos[contadorProductos]= lib;
								
							}
							else {
								if(tipoProduc==2) {
									Revista rev= new Revista(nomb, aut, edito, valor,0);
									productos[contadorProductos] = rev;
								}
								else {
									if(tipoProduc==3) {
										Articulo arti = new Articulo(nomb, aut, edito, valor, 0);
										productos[contadorProductos] = arti;
									}
								}
							}
							
							System.out.println("Se agrego correctamente el producto");
							contadorProductos++;
						}
						else {
							System.out.println("El dato ingresado no es valido");
						}
						
						break;
				case 3: System.out.println("Ingrese ID del producto a agregar inventario");
						Scanner in7 = new Scanner(System.in);
						int id = in7.nextInt();
						if(productos[id]!= null) {
							System.out.println("¿cantidad de inventario a ingresar?");
							Scanner in8 = new Scanner(System.in);
							int canti= in8.nextInt();
							productos[id].setCantidad(canti+productos[id].getCantidad());
							System.out.println("se agrego la cantidad correctamente");
						}
						else {
							System.out.println("La ID no es de ningun producto");
							
						}
						break;
				case 4: System.out.println("¿Cual es la ID del producto a comprar?");
						Scanner in9 = new Scanner(System.in);
						int id2 = in9.nextInt();
						if(productos[id2]!=null) {
							System.out.println("Nombre: "+productos[id2].getNombre());
							System.out.println("Precio: $"+productos[id2].getPrecio());
							System.out.println("Cantidad disponible: "+productos[id2].getCantidad());
							if(productos[id2].getCantidad()!=0) {
								System.out.println("Cuantos desea comprar");
								Scanner in10= new Scanner(System.in);
								int cantComp = in10.nextInt();
								if(cantComp<=productos[id2].getCantidad()) {
									productos[id2].setCantidad(productos[id2].getCantidad()-cantComp);
									System.out.println("Valor a pagar: $"+((productos[id2].getPrecio())*cantComp));
								}
								else {
									System.out.println("La cantidad seleccionada supera la cantidad de ejemplares disponibles, pronto habra mas stock");
								}
								
							}
							else {
								System.out.println("No hay stock diponible para este ejemplar, pronto habran mas disponibles");
							}
						}
						else {
							System.out.println("La ID no pertenece a ningun ejemplar");
						}
						break;
				case 5:
						break;
				default: menu();
			}
				
			
		}
		

	}

}



	


