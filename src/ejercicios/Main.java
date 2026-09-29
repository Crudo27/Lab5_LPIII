package ejercicios;

public class Main{
	public static <F, S> void imprimirPar(Par<F, S> par)
	{
		System.out.println(par);
	}

	public static void main(String[] args)
	{
		Par<String, Integer> par1 = new Par<>("Lenguajes de Programacion III", 5);
		Par<Double, Boolean> par2 = new Par<>(18.5, true);
		Par<Persona, Integer> par3 = new Par<>(new Persona("Gian Piero"), 20);

		System.out.println("Pares del ejercicio 3:");
		imprimirPar(par1);
		imprimirPar(par2);
		imprimirPar(par3);

		Contenedor<String, Integer> vehiculos = new Contenedor<>();
		vehiculos.agregarPar("Volkswagen", 2025);
		vehiculos.agregarPar("Toyota", 2024);
		vehiculos.agregarPar("Kia", 2023);

		System.out.println("\nContenedor de vehiculos:");
		vehiculos.mostrarPares();
		System.out.println("\nPar en el indice 1:");
		System.out.println(vehiculos.obtenerPar(1));
		System.out.println("\nCantidad total de pares: " + vehiculos.obtenerTodosLosPares().size());
	}
}
