class area
{	void area()
	{
			System.out.println("Null");
	}
}
class sqr extends area
{
	void area()
	{
		int a=0;
		if(a==0)
		{
			super.area();
		}
		else
		{ int d=a*a;
			System.out.println("" +d);
		}
	}
} 
class rec extends area
{
	void area()
	{
		int a=20,b=3;
		int d=a*b;
		System.out.println("" +d);
	}
} 
class call
{
	public static void main(String[] args) 
	{
		area x= new area();
		x.area();
		sqr y= new sqr();
		y.area();
		rec z= new rec();
		z.area();
	}

}