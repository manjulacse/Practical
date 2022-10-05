class Bankoverride 
{
  int getrateofint()
 {
     return 6;
}
}
 class Axis extends Bankoverride 
{ 
    int getrateofint() 
{  
    return 5;
}
}

class Demo {
 Public static void main( String args[])
{
     Bank obj= new Bank();
   obj.getrateofint();
  }
}