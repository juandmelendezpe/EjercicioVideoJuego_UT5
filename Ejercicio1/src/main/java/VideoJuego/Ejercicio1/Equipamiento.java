package VideoJuego.Ejercicio1;

public class Equipamiento {
	private int id;
	private String espaciosEnMochila;
	
	public Equipamiento(int id, String espaciosEnMochila) {
		super();
		this.id = id;
		this.espaciosEnMochila = espaciosEnMochila;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspaciosEnMochila() {
		return espaciosEnMochila;
	}

	public void setEspaciosEnMochila(String espaciosEnMochila) {
		this.espaciosEnMochila = espaciosEnMochila;
	}
	
	
}

