 class Demo{
    static float x;
    static void fun1(){
        // System.out.println(x);
         int y =10;
    }

class Demo1{

    private int x;

     static void fun3()
    {

       int x=88;
          System.out.println("hello");
          System.out.println(x);


    }
        void fun2(){
            int x=99;
            System.out.println(x);
            // System.out.println("herllo");
        }
    
    }

}

class pratice {
    public static void main(String arg[]){

        int x = 0;
        // System.out.println(x);
        // System.out.println(fun1.y);
        Demo.fun1();
        // Demo1.fun2();
        Demo d1 =new Demo();
        d1.fun1();
        Demo.Demo1 dd1 = d1.new Demo1();
        dd1.fun2();
        dd1.fun3();
        // d1.fun2();
     
        // d1.fun3();
        // Demo.fun3();
               
    }
}