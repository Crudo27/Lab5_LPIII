package ejercicios;

public class PruebaPar{
	public static void main(String[] args)
	{
		Par<String, Integer> par1 = new Par<>("Edad", 20);
		Par<String, Integer> par2 = new Par<>("Edad", 20);
		Par<String, Integer> par3 = new Par<>("Codigo", 20);

		System.out.println(par1);
		System.out.println("par1 es igual a par2: " + par1.esIgual(par2));
		System.out.println("par1 es igual a par3: " + par1.esIgual(par3));

		par3.setPrimero("Edad");
		System.out.println("par3 modificado: " + par3);
		System.out.println("Primero: " + par3.getPrimero());
		System.out.println("Segundo: " + par3.getSegundo());
	}
}
