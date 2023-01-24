class Main {

  //do_stuff1 method
  public static void do_stuff1 (int x){
    x=15;
  }

  //do_stuff2 method
  public static void do_stuff2 (Number x){
    System.out.println(x.char1);
    x.char1='b';
  }

  //doubleIt method
  public static int doubleIt(int x) {
    return(2*x);
  }

  //MAIN method.
  public static void main(String[] args) {
    Number myNumber = new Number();

    System.out.println(myNumber.char1);

    /*VERY IMPORTANT: IF AN OBJECT IS PASSED INTO A METHOD
THAT OBJECT AND ANY CHANGES PERSIST AFTER THE METHOD. NOT TRUE IF ITS A PRIMITIVE TYPE.K
    
    */

    do_stuff2(myNumber);//Call to method complex data passed as a reference.

    
    int a= 0 ;
    System.out.println("1: "+a);

    //Call method. Pass in value.
    do_stuff1(a);

    System.out.println("2: "+a);

    int b = 2;
    System.out.println("b="+b);
    b = doubleIt (b);
    System.out.println("b="+b);
    
    
    
    
  }
}