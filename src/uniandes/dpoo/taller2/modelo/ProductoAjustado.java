package uniandes.dpoo.taller2.modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto
{
	// Atributos
	ProductoMenu base;
	ArrayList<Ingrediente> agregados = new ArrayList<Ingrediente>();
	ArrayList<Ingrediente> eliminados = new ArrayList<Ingrediente>();
	

	// Constructor
	public ProductoAjustado(ProductoMenu base)
	{
		this.base = base;
	}
	
	// Metodos
	public void agregarOEliminarIngrediente(Ingrediente ingrediente)
	{
		
	}

	@Override
	public int getPrecio()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generarTextoFactura()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
