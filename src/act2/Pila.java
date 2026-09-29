package act2;

public class Pila<E>{
	private final int tamanio;
	private int superior;
	private E[] elementos;

	public Pila()
	{
		this(10);
	}

	public Pila(int s)
	{
		tamanio = s > 0 ? s : 10;
		superior = -1;
		elementos = (E[]) new Object[tamanio];
	}

	public Pila(Pila<E> p)
	{
		this.tamanio = p.tamanio;
		this.superior = p.superior;
		this.elementos = (E[]) new Object[this.tamanio];
		System.arraycopy(p.elementos, 0, this.elementos, 0, p.tamanio);
	}

	public void push(E valorAMeter)
	{
		if(superior == tamanio - 1)
		{
			throw new ExcepcionPilaLlena(String.format("La Pila esta llena, no se puede meter %s", valorAMeter));
		}
		elementos[++superior] = valorAMeter;
	}

	public E pop()
	{
		if(superior == -1)
		{
			throw new ExcepcionPilaVacia("Pila vacia, no se puede sacar");
		}
		return elementos[superior--];
	}

	public boolean contains(E elemento)
	{
		Pila<E> copia = new Pila<>(this);
		while(copia.superior >= 0)
		{
			if(copia.pop().equals(elemento))
			{
				return true;
			}
		}
		return false;
	}
}
