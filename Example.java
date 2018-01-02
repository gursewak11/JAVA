class example
{
	int area(int x)
	{
		int y;
		y=x*x;
		return y;
	}
	int area(int x,int y)
	{
		int z;
		z=x*y;
		return z;
	}
	public static void main(String[] args)
	 {
 	X q= new X();
	System.out.println(" "+ q.area(5));
	System.out.println(" "+ q.area(3,9));
	}
}