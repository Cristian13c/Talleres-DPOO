package uniandes.dpoo.taller2.modelo;

import java.util.ArrayList;

public class Combo implements Producto
{
	// Atributos
	private double descuento;
	private String nombreCombo;
	private ArrayList<ProductoMenu> itemsCombo;
	
	// Constructor 
	public Combo(double descuentos, String nombreCombo)
	{
		this.descuento = descuentos;
		this.nombreCombo = nombreCombo;
	}
	
	// Metodos
	public void agregarItemACombo(Producto itemCombo)
	{
		
	}
	
	@Override
	public int getPrecio()
	{
		
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
