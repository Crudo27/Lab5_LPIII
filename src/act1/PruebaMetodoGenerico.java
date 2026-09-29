package act1;

public class PruebaMetodoGenerico{
	public static <E> void imprimirArreglo(E[] arregloEntrada)
	{
		for(E elemento : arregloEntrada)
		{
			System.out.printf("%s ", elemento);
		}
		System.out.println();
	}

	public static <E> int imprimirArreglo(E[] arregloEntrada, int subindiceInferior, int subindiceSuperior)
	{
		if(subindiceInferior < 0 || subindiceSuperior >= arregloEntrada.length || subindiceSuperior <= subindiceInferior)
		{
			throw new InvalidSubscriptException("Los subindices ingresados no son validos");
		}

		int cantidad = 0;
		for(int i = subindiceInferior; i <= subindiceSuperior; i++)
		{
			System.out.printf("%s ", arregloEntrada[i]);
			cantidad++;
		}
		System.out.println();
		return cantidad;
	}

	public static void main(String[] args)
	{
		Integer[] arregloInteger = {1, 2, 3, 4, 5, 6};
		Double[] arregloDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] arregloCharacter = {'H', 'O', 'L', 'A'};

		System.out.println("El arreglo arregloInteger contiene:");
		imprimirArreglo(arregloInteger);
		System.out.println("Parte del arreglo arregloInteger:");
		System.out.println("Elementos impresos: " + imprimirArreglo(arregloInteger, 1, 4));

		System.out.println("\nEl arreglo arregloDouble contiene:");
		imprimirArreglo(arregloDouble);
		System.out.println("Parte del arreglo arregloDouble:");
		System.out.println("Elementos impresos: " + imprimirArreglo(arregloDouble, 2, 5));

		System.out.println("\nEl arreglo arregloCharacter contiene:");
		imprimirArreglo(arregloCharacter);
		System.out.println("Parte del arreglo arregloCharacter:");
		System.out.println("Elementos impresos: " + imprimirArreglo(arregloCharacter, 0, 2));

		try
		{
			imprimirArreglo(arregloCharacter, 2, 2);
		}
		catch(InvalidSubscriptException e)
		{
			System.out.println("\n" + e.getMessage());
		}
	}
}
