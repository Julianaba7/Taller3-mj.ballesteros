package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Map<String, Tiquete> tiquetes = new HashMap<String, Tiquete>();
	  
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
		return  tiquetes.values();
	}
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException {
		int total = 0;
		
		for (int i = 0; i<cantidad; i++) {
			int precioTiquete = calculadora.calcularTarifa(this, cliente);
            if (tiquetes.size() < avion.getCapacidad()) {
            	Tiquete tiquete = GeneradorTiquetes.generarTiquete(this, cliente, precioTiquete);
            	String cod = (tiquete.getCodigo());
                tiquetes.put(cod, tiquete);
                total += precioTiquete;
            } else {
                throw new VueloSobrevendidoException(this);
            }
		}
		return total;
	}
	public boolean equals(Object obj) {
		return false;
	}

}
