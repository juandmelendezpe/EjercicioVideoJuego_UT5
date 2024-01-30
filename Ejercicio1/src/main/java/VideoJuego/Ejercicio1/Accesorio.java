package VideoJuego.Ejercicio1;

public class Accesorio extends Equipamiento {
	private String nombre;
	private String funcion;
	
	public Accesorio(int id, String espaciosEnMochila, String nombre, String funcion) {
		super(id, espaciosEnMochila);
		this.nombre = nombre;
		this.funcion = funcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	
	
}
