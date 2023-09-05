package uniandes.dpoo.taller2.consola;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import uniandes.dpoo.taller2.modelo.Producto;
import uniandes.dpoo.taller2.modelo.Restaurante;

public class Aplicacion
{
	// Atributos
	static Restaurante restaurante;

	// Metodos
	public static void main(String[] args) throws IOException
	{
		// Metodo main, llama la funcion para cargar la informacion y inicializa el menu
		restaurante = new Restaurante();

		File Ingredientes = new File("data/ingredientes.txt");
		File Menu = new File("data/menu.txt");
		File Combos = new File("data/combos.txt");

		restaurante.cargarInformacionRestaurante(Ingredientes, Menu, Combos);

		boolean continuar = true;

		while (continuar)
		{
			mostrarMenu();
		}
	}

	public static void mostrarMenu() throws IOException
	{
		// Muestra el menu de la aplicacion y recibe una opcion mediante la consola.

		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Mostrar el menu");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerrar un pedido y guardad la factura");
		System.out.println("5. Consultar la informacion de un pedido dado su id");

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String entradaStr = entrada.readLine();

		int opcionSeleccionada = Integer.parseInt(entradaStr);
		ejecutarOpcion(opcionSeleccionada);
	}

	public static void ejecutarOpcion(int opcionSeleccionada) throws IOException
	{
		try
		{

			if (opcionSeleccionada == 1)
				menu(1);
			else if (opcionSeleccionada == 2)
				iniciarNuevoPedido();
			// else if (opcionSeleccionada == 3 && calculadora != null)

			// else if (opcionSeleccionada == 4 && calculadora != null)

			// else if (opcionSeleccionada == 5 && calculadora != null)

		} catch (NumberFormatException e)
		{
			System.out.println("Debe seleccionar uno de los números de las opciones.");
		}

	}

	private static boolean menu(int opcionSeleccionada)
	{
		boolean continuarPedido = true;
		if (opcionSeleccionada == 1)
		{
			ArrayList<Producto> menuBase = restaurante.getMenuBase();

			System.out.println("///MENU///");
			System.out.println("///Productos base///");

			int i = 0;

			for (Producto producto : menuBase)
			{
				i++;
				String nombre = producto.getNombre();
				int precioBase = producto.getPrecio();
				String numero = Integer.toString(i);
				System.out.println(numero + ". " + nombre + ". precio: " + Integer.toString(precioBase));
			};
			

		} else if (opcionSeleccionada == 2)
		{

		} else if (opcionSeleccionada == 3)
		{
			continuarPedido = false;
		}
		return continuarPedido;
	}

	public static void iniciarNuevoPedido() throws IOException
	{
		// Le pregunta al usuario los datos del cliente y inicia un nuevo pedido
		boolean continuarPedido = true;

		System.out.println("Ingrese el nombre del cliente");
		BufferedReader entradaNombre = new BufferedReader(new InputStreamReader(System.in));
		String nombreCliente = entradaNombre.readLine();

		System.out.println("Ingrese la direccion del cliente");
		BufferedReader entradaDireccion = new BufferedReader(new InputStreamReader(System.in));
		String direccionCliente = entradaDireccion.readLine();
		while (continuarPedido)
		{
			System.out.println("///OPCIONES DE PRODUCTOS///");
			System.out.println("1. Producto de menu");
			System.out.println("2. Combos");
			System.out.println("3. Atras");
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			String entradaStr = entrada.readLine();
			int opcionMenu = Integer.parseInt(entradaStr);
			
			continuarPedido = menu(opcionMenu);
			
			System.out.println("---Seleccione el producto---");
			
			BufferedReader entradaProducto = new BufferedReader(new InputStreamReader(System.in));
			String entradaProductoStr = entradaProducto.readLine();
			int producto = Integer.parseInt(entradaProductoStr);

		}
	}
}
