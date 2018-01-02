class area
	{
		void  area()
		{
			System.out.println(" Area is zero");
		}
	}
class square extends area 
	{
		void area()
		{
			
			int a=10;
			if(a==0)
				super.area();
			else 
				{int b=a*a;
				System.out.println(" "+b);
			}
		}
	}
	class rectangle extends area
	{
		void area()		
		{
			int a=5,b=8;
			if (a==0||b==0)
				super.area();
			else
		{
			int c=a*b;
			System.out.println(" "+c);
		}
		}
	}
	class example3
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

