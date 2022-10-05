class A 
{ 
 int x=10;
}
class B extends A {
 int x=5;
 void show ()
{
  System.out.println (super.x);
}
}
public class Demo {
public static void main ( String args []) {
  B obj= new B();
  obj.show();
}
}