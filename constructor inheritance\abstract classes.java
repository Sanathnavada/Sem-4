abstract class a{
	 a()
	{
	System.out.println("A's cnstr");
	}
	abstract void test();

}

 class b extends a
{
	
	 b()
	{
	System.out.println("B's cnstr");
	}
	void test()
	{
	    System.out.println("b's abstract");
	}
	
		
}
class c extends b
{
	
	c()
	{
	System.out.println("C's cnstr");
	}
	
}	
class d extends a
{
	
	d()
	{
	System.out.println("D's cnstr");
	}
	void test()
	{
	    System.out.println("d's abstract");
	}	
	
}

class Main
{
	public static void main(String[] args)
	{


       System.out.println("Order of deviation of constructors using A,B,C: ");
	c obj = new c();
	
	System.out.println("abstract class used ");
	
	a obj1 = new b();
	a obj2 = new d();
	obj1.test();
	obj2.test();
	
	
	
	
         }
}
