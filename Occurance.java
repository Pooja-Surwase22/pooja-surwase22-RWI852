package String;

public class Occurance {
  public static void main(String[] args) {
	  String str="i am lakhan";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			for(int j=i+1;j<str.length();j++)
			{
				char c1=str.charAt(j);
				
				if(c==c1) 
				{
				 count++;
				}
			}
			
		}
		System.out.println(count);
}
}
