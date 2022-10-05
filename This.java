class This {   
       int age;
       void input ( int age)
{     this.age= age;
}
     void display () {
    System.out.println (age);
  }
 public static void main ( String args[]) {
  This obj= new This();
   obj.input(18);
   obj.display();
}
}