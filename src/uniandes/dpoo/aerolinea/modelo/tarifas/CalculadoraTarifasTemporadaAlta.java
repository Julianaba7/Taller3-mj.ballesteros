package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {
	
	protected static final int COSTO_POR_KM = 1000;
	
	public CalculadoraTarifasTemporadaAlta() {
		super();}
		// TODO Auto-generated constructor stub
		@Override
		protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
			Ruta ruta= vuelo.getRuta();
			int kilometros= Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
			return COSTO_POR_KM*kilometros;
		}
		@Override
		protected double calcularPorcentajeDescuento(Cliente cliente) {
			// TODO Auto-generated method stub
			return 0;
		}

}
