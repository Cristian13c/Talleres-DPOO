package uniandes.dpoo.taller2.modelo;

public class ProductoAjustado implements Producto
{
	// Atributos
	ProductoMenu base;

	// Constructor
	public ProductoAjustado(ProductoMenu base)
	{
		this.base = base;
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
