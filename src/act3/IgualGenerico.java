package act3;

public class IgualGenerico{
	public static <E> boolean esIgualA(E a, E b)
	{
		if(!a.equals(b))
		{
			return false;
		}
		return true;
	}
}
