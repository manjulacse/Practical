class Student1 {
           int rollno;
           String name;
            void input( int r, String n)
          {
               rollno=r;
               name=n;
           }
            void output()
{
        System.out.println( rollno+ "  "+ name);
}
     public static void main( String args[]) {
        Student obj= new Student();
         obj.input(10, "manjula");
          obj.output();
        }
}