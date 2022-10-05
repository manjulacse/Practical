package javapackage;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1; i<=30; i=i+3) // a
		{
			System.out.println(i);
		}
        // b
		
		for (i=1; i<40; i=i*2) {
			
			System.out.println(i);
		}
		
		// c
			
			      int first= 0;
			       int second = 1;
			      int next ;
			    
			   for( i=1; i<11; i++)
			{
			 System.out.println(first);
			    next=first+second;
			      first=second;
			      second= next;
			     }
			


	}
	

}
