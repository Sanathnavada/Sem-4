class a
{

	void aa()
	{
	System.out.println("level 1");
	}
	void callme()
	{
		System.out.println("A's method");
	}
	
	
}

class b extends a
{
	void bb()
	{
	System.out.println("level 2");
	}
        void callme()
	{
		System.out.println("B's method");
	}
	
		
}
class c extends b
{
	void cc()
	{
	System.out.println("level 3");
	}
        void callme()
	{
		System.out.println("C's method");
	}
	
}
class d extends a
{
	void dd()
	{
	System.out.println("level 2");
	}
        void callme()
	{
		System.out.println("D's method");
	}

}
abstract class e
{
abstract void print();
}
	

class Main
{
	public static void main(String[] args)
	{
	
	System.out.println("multilevel inheritance using A,B,C : ");	
	c obj = new c();
	obj.aa();
	obj.bb();
	obj.cc();
	System.out.println("hierarchial inheritance using A,B,D : ");
	d obj1 = new d();
	obj1.aa();
	obj.bb();
	obj1.dd();
	System.out.println("Dynamic dispatch using A,B,C : ");
	a obj2 = new a();
	b obj3 = new b();
	a r;
	r=obj2;
	r.callme();
	r=obj3;
	r.callme();
	r=obj;
	r.callme();
	
	a obj5 = new b();
	a obj6 = new c(); 
	
	
	
	//	System.out.println(" ");
	}
}
