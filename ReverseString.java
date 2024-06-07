package String;

public class ReverseString {

	public static void main(String[] args)
	{  String str="hlw poo";
	   String p3=" ";
	   
	   for(int i=str.length()-1;i>=0;i--)
	   {
		   char c=str.charAt(i);
		   p3=p3+c;
	   }
	   System.out.println(p3);
}
		// TODO Auto-generated method stub

	}

