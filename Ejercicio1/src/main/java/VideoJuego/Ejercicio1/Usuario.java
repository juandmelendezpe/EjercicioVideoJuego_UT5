package VideoJuego.Ejercicio1;

import java.util.Objects;

public class Usuario {
	private String nombre;
	private int espaciosMochila;
	
	public Usuario(String nombre, int espaciosMochila) {
		this.nombre = nombre;
		this.espaciosMochila = espaciosMochila;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEspaciosMochila() {
		return espaciosMochila;
	}

	public void setEspaciosMochila(int espaciosMochila) {
		this.espaciosMochila = espaciosMochila;
	}

	@Override
	public int hashCode() {
		return Objects.hash(espaciosMochila, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return espaciosMochila == other.espaciosMochila && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", espaciosMochila=" + espaciosMochila + "]";
	}
	

}
