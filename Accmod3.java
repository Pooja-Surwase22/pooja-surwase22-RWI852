package Day2;
import Day1.*;
public class Accmod3 extends Accmod2 {
  public static void main(String[]args)
  {
	  System.out.println(Accmod2.a);
	//  System.out.println(Accmod2.c);default cannot be used in other package 
	  System.out.println(d);// protected can be used in other pacakage by inheritance
	  
  }
}
