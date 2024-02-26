package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	private List<Tiquete> tiquetesSinUsar = new ArrayList<Tiquete>();
	private List<Tiquete> tiquetesUsados = new ArrayList<Tiquete>();

	public Cliente(List<Tiquete> tiquetesSinUsar, List<Tiquete> tiquetesUsados) {
		super();
		this.tiquetesSinUsar = tiquetesSinUsar;
		this.tiquetesUsados = tiquetesUsados;
	}
	
	public List<Tiquete> getTiquetesSinUsar() {
		return tiquetesSinUsar;
	}


	public void setTiquetesSinUsar(List<Tiquete> tiquetesSinUsar) {
		this.tiquetesSinUsar = tiquetesSinUsar;
	}


	public List<Tiquete> getTiquetesUsados() {
		return tiquetesUsados;
	}


	public void setTiquetesUsados(List<Tiquete> tiquetesUsados) {
		this.tiquetesUsados = tiquetesUsados;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTipoCliente() {
		return null;
	}
	public String getIdentificador() {
		return null;
	}
	public void agregarTiquete(Tiquete tiquete) {
		
	}
	public int calcularValorTotalTiquetes() {
		return -1;
	}
	public void usarTiquetes(Vuelo vuelo) {
		
	}
}
