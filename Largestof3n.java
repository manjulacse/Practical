package javapackage;
import java.util.Scanner;
public class Largeof3n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the three numbers");
      Scanner obj= new Scanner(System.in);
      int a = obj.nextInt();
      int b = obj.nextInt(); 
      int c = obj. nextInt();
      if(a>b && a>c)
      {
    	  System.out.println("A is greater ");
      }
      else if(b>a && b>c) {
    	  
    	  System.out.println(" B is greater");
      }
      
      else {
    	  System.out.println(" C is greater value");
      }
	}

}