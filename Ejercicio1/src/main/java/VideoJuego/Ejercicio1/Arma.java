package VideoJuego.Ejercicio1;

public class Arma extends Equipamiento{
	private String nombre;
	private int daño;
	
	public Arma(int id, String espaciosEnMochila, String nombre, int daño) {
		super(id, espaciosEnMochila);
		this.nombre = nombre;
		this.daño = daño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
	
}
