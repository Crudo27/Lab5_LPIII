package ejercicios;

public class Par<F, S>{
	private F primero;
	private S segundo;

	public Par(F primero, S segundo)
	{
		this.primero = primero;
		this.segundo = segundo;
	}

	public F getPrimero()
	{
		return primero;
	}

	public S getSegundo()
	{
		return segundo;
	}

	public void setPrimero(F primero)
	{
		this.primero = primero;
	}

	public void setSegundo(S segundo)
	{
		this.segundo = segundo;
	}

	public boolean esIgual(Par<F, S> otroPar)
	{
		if(!primero.equals(otroPar.primero))
		{
			return false;
		}
		if(!segundo.equals(otroPar.segundo))
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "(Primero: " + primero + ", Segundo: " + segundo + ")";
	}
}
