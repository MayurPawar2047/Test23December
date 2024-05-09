package generic;

public class Demo<E,R>//E is datatype o
{
	static char b;//Global Static
	int a=23;
	
	E c;//Generic variable -Non Static
	
	R d;

	public R test(E x)
	{
		System.out.println("Hello");
		return d;
	}
	
	public void aplha(E x)
	{
		System.out.println("Hello");
	}
	
	public R get(int x)
	{
		System.out.println("Hello");
		return d;
	}
	
	
	
	
	
	//static E d;//static variable can not be generic variable
}

