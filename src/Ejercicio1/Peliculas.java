package Ejercicio1;

public class Peliculas {
	
	private int id;
	private String nombre;
	private Genero genero;
	private static int cont = 0;
	
	public static int ProximoId() {
		return cont+1;
	}
	
	public Peliculas() {
	}

	public Peliculas(String nombre,Genero genero) {
		cont ++;
		this.id = cont;
		this.nombre = nombre;
		this.genero = genero;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "ID: " + this.id + " Nombre: " + this.nombre + " Genero: " + this.genero;
	}
	
	
	

}
