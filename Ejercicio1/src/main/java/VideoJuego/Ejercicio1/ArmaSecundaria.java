package VideoJuego.Ejercicio1;

public class ArmaSecundaria extends Arma {
	private String tipo;

	public ArmaSecundaria(int id, String espaciosEnMochila, String nombre, int daño, String tipo) {
		super(id, espaciosEnMochila, nombre, daño);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
