package e0404.libreria;

import e0404.excepciones0404.*;

public class Conductor {
	private boolean tieneCarnet;
	private int edad;
	private String nombre;

	public static final int EDAD_VALIDA = 18;
	public static final int LONGITUD_NOMBRE_VALIDO = 3;
	public static final boolean CARNET_VALIDO = true;

	public Conductor(boolean tieneCarnet, int edad, String nombre) throws ConductorMenorException,
	ConductorMenorYNombreInsfException, ConductorSinCarnetException, ConductorNombreInsuficienteException
	{
		if(tieneCarnet != CARNET_VALIDO)
			throw new ConductorSinCarnetException("El conductor no posee carnet de conducir");
		else if(edad < EDAD_VALIDA && nombre.length() < LONGITUD_NOMBRE_VALIDO)
			throw new ConductorMenorYNombreInsfException("El conductor es menor de edad y su nombre es muy corto");
		else if(edad < EDAD_VALIDA)
			throw new ConductorMenorException("El conductor es menor de edad, por favor corrigelo");
		else if(nombre.length() < LONGITUD_NOMBRE_VALIDO)
			throw new ConductorNombreInsuficienteException("El conductor tiene un nombre muy corto, por favor, corrigelo");
		else
		{
			this.tieneCarnet = tieneCarnet;
			this.edad = edad;
			this.nombre = nombre;
		}
	}
	
	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean tieneCarnet() {
		return tieneCarnet;
	}

}
