class Inheritance3 extends B
{
	public static void main(String[] args) 
	{
		sleep();
		writing();
	}
}
class A extends B
{
}
class B
{
	public static void sleep()
	{
	System.out.println("sleeping");
	}
	public static void writing()
	{
		System.out.println("writing");
	}
}
