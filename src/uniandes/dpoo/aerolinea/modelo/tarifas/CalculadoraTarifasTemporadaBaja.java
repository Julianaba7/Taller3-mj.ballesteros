package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas  {
	
	protected static final int COSTO_POR_KM_NATURAL = 600;
	protected static final int COSTO_POR_KM_CORPORATIVO = 900;
	protected static final double DESCUENTO_PEQ = 0.02;
	protected static final double DESCUENTO_MEDIANAS = 0.1;
	protected static final double DESCUENTO_GRANDES = 0.2;
	
	public CalculadoraTarifasTemporadaBaja() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		Ruta ruta= vuelo.getRuta();
		int kilometros= Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
		if (cliente.getTipoCliente()=="Natural") {
			return COSTO_POR_KM_NATURAL*kilometros;
		}
		else {
			return COSTO_POR_KM_CORPORATIVO*kilometros;
		}
	}

	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		double porcentaje = 0;
		if ( cliente instanceof ClienteCorporativo) {
			ClienteCorporativo clienteCorporativo = (ClienteCorporativo) cliente;
            int tamano = clienteCorporativo.getTamanoEmpresa();
            if (tamano==1) {
            	porcentaje= DESCUENTO_GRANDES;
            }
            if (tamano==2) {
            	porcentaje=  DESCUENTO_MEDIANAS;
            }
            if (tamano==3) {
            	porcentaje=  DESCUENTO_PEQ;
            }
		}
		
		return porcentaje;
	}}
	
