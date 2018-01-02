class area
	{
		void  area()
		{
			System.out.println("Null");
		}
	}
class square extends area 
	{
		void area()
		{
			int a=5;
			int b=a*a;
			System.out.println(" "+b);
		}
	}
	class rectangle extends area
	{
		void area()		
		{
			int a=5,b=5;
			int c=a*b;
			System.out.println(" "+c);

		}
	}
	class example2
	{
		public static void main(String[] args)
		{
			area x= new area();
			x.area();
			square y= new square();
			y.area();
			rectangle z= new rectangle();
			z.area();
		}
	}