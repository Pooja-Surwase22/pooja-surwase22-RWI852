class Multi extends A 
{
	public static void main(String[] args) 
	{
		Multi a=new Multi();
		a.run();
	}
	public void run()
	{
		System.out.println("swimming");
	}
}
class A
{
	public void run()
	{
		System.out.println("running");
	}
}
