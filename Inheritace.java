class Inheritance extends B
{
	public static void main(String[] args) 
	{
		run();
		Inheritance aa=new Inheritance();
		aa.swim();
	}
}
class B
{
	public static void run()
	{
		System.out.println("running");
	}
	public void swim()
	{
		System.out.println("swimming");
	}
}
