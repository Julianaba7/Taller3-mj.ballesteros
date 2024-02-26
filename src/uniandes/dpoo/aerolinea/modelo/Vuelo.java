package uniandes.dpoo.aerolinea.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private List<Tiquete> tiquetes = new ArrayList<Tiquete>();
	  
	public Vuelo(String fecha, Avion avion, Ruta ruta) {
		super();
		this.fecha = fecha;
		this.avion = avion;
		this.ruta = ruta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	public Collection<Tiquete> getTiquetes(){
		return null;
	}
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		return -1;
	}
	public boolean equals(Object obj) {
		return false;
	}
	
	
	
	
	

}
