package Ejercicio1;


public class Peliculas implements Comparable<Peliculas> {
	
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
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Peliculas o) {		
		//Comparar para ordenar por nombre
		return this.getNombre().compareTo(o.getNombre());
	}

		


}
