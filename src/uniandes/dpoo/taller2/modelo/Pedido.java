package uniandes.dpoo.taller2.modelo;

import java.io.File;
import java.util.ArrayList;

public class Pedido
{
	// Atributos
	static private int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	private ArrayList<Producto> itemsPedido = new ArrayList<Producto>();
	
	// Constructor
	public Pedido(String nombreCliente, String direccionCliente)
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		String codigo = nombreCliente + direccionCliente;
		idPedido = codigo.hashCode();
		numeroPedidos ++;
		
	}
	
	// Metodos
	public int getIdPedido()
	{
		return idPedido;
	}
	
	public void agregarProducto(Producto nuevoItem)
	{
		itemsPedido.add(nuevoItem);
	}
	
	private int getPrecioNetoPedido()
	{
		
		return 0;
	}
	
	private int getPrecioTotalPedido()
	{
		
		return 0;
	}
	
	private int getPrecioIVAPedido()
	{
		
		return 0;
	}
	
	private String generarTextoFactura()
	{
		for(Producto producto:itemsPedido)
		{
			
		}
		return null;
	}
	
	public void guardarFactura(File archivo)
	{
		
	}
}
