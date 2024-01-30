package VideoJuego.Ejercicio1;

public class ArmaPrincipal extends Arma{
	private int balas;

	public ArmaPrincipal(int id, String espaciosEnMochila, String nombre, int daño, int balas) {
		super(id, espaciosEnMochila, nombre, daño);
		this.balas = balas;
	}

	public int getBalas() {
		return balas;
	}

	public void setBalas(int balas) {
		this.balas = balas;
	}
	
	
	
}
