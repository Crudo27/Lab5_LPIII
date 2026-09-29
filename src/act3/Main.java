package act3;

public class Main{
	public static void main(String[] args)
	{
		Object objeto1 = new Object();
		Object objeto2 = objeto1;
		Integer entero1 = 25;
		Integer entero2 = 25;
		String texto1 = "hola";
		String texto2 = "hola";

		System.out.println("Tipo integrado: " + IgualGenerico.esIgualA(10, 10));
		System.out.println("Object: " + IgualGenerico.esIgualA(objeto1, objeto2));
		System.out.println("Integer: " + IgualGenerico.esIgualA(entero1, entero2));
		System.out.println("String: " + IgualGenerico.esIgualA(texto1, texto2));
		System.out.println("null: " + IgualGenerico.esIgualA(null, null));
	}
}
