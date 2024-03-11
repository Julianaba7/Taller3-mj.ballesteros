package uniandes.dpoo.aerolinea.persistencia;

import java.io.IOException;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public class PersistenciaAerolineaJson implements IPersistenciaTiquetes
{
	
	 @Override
	    public void cargarAerolinea( String archivo, Aerolinea aerolinea )
	    {
	        // No está implementado (y no es necesario para el taller)
	    }

	    @Override
	    public void salvarAerolinea( String archivo, Aerolinea aerolinea )
	    {
	        // No está implementado (y no es necesario para el taller)
	    }

		@Override
		public void cargarTiquetes(String archivo, Aerolinea aerolinea)
				throws IOException, InformacionInconsistenteException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void salvarTiquetes(String archivo, Aerolinea aerolinea) throws IOException {
			// TODO Auto-generated method stub
			
		}



}
