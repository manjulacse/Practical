class Person {
  void display( int pid, String name) {
   System.out.println( pid);
    }
 Class Students extends Person {
    void method ( int marks , int salary) {
    Systemout.println( marks);
   }
 class Demo {
  public static void main ( String args[] ) {
     Students obj = new Students();
      obj.method();
  }
 }
 