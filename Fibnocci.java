public class Fibnocci {
public static void main(String args[])
{
      int first=0
       int second = 1;
      int next ;
    int i;
   for( i=1; i<11; i++)
{
    System.out.println(first);
    next=first+second;
      first=second;
      second= next;
     }
}
}
