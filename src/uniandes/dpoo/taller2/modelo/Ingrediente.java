package uniandes.dpoo.taller2.modelo;

public class Ingrediente
{
	// Atributos
	String nombre;
	int costoAdicional;

	// Constructor
	public Ingrediente(String nombre, int costoAdicional)
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}

	// Metodos
	public String getNombre()
	{
		return nombre;
	}
	
	public int getCostoAdicional()
	{
		return costoAdicional;
	}
}
