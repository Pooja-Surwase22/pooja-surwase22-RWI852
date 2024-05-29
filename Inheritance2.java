class Inheritance2 extends B
{
	public static void main(String[] args) 
	{
		run();
		kill();
	}
}
class B extends C
{
	public static void kill()
	{
		System.out.println("killing");
	}
}
class C
{
	public static void run()
	{
      System.out.println("running");
	}
}
