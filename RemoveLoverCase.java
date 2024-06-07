package removelovercase;

public class RemoveLoverCase {

	public static void main(String[] args) {
		String str="Hello poo";
		String str1=" ";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(Character.isUpperCase(c))
			{
				str1=str1+c;
			}
		}
		System.out.println(str1);
	}
	
		// TODO Auto-generated method stub

	}
