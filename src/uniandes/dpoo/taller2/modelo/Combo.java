package uniandes.dpoo.taller2.modelo;

public class Combo implements Producto
{
	// Atributos
	private double descuento;
	private String nombreCombo;
	
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
