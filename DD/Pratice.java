


 class A{

//     private int x;
//     private static int y;
// float a = Float.parseFloat("1234");
// Integer x1 = Integer.valueOf("11111111",2);
// int y1 = x1.intValue();

//     void fun1(){
//         y=40;
//         x=44;



    // }
    // void fun2(){
    //     System.out.println(y);
    //     System.out.println(x);
    //     a += 10;
    //     System.out.println(a);
    //     System.out.println(y1);
    // }

    // void fun3(){
    //     y=66;
    // }
    public static void main(){
        System.out.println("I'm in call of A");
    }

    
}

interface D {
    int x=10;

    static void callMe(){
        System.out.println("I'm in callMe of D");
    }
    void display();

}

interface E{
    void display();
    void print();
}

abstract class B{
    int x;
    abstract void show();
    B(){
        System.out.println("I'm in B Constructer");
    }
}

class C implements D,E
{
     C(){
        System.out.println("I'm in C Constructer");
    }
    void show(){
        System.out.println("I'm in C");
    }
   public void display(){
    System.out.println("I'm in display of D");
   }

   public void print(){
    System.out.println("I'm in Print of E");
   }
   

}




public class Pratice {
    public static void main(String []args) {

//         double now = System.currentTimeMillis();

// A a1 =new A();
// // a1.findSum(9999);
// // System.out.println(a1.findSum(9999));

// System.out.println("Time taken is :"+ (System.currentTimeMillis() - now )+ "milli");

// int[] array1 = new int[5];
// array1[1]= 25;

// for(int i =0; i<array1.length ; i++){
//     array1[i] = i*5;
//     System.out.println(array1[i]);

// }



        // Pp p1 =new Pp();
        //    p1.getValue(10,39);
        //    p1.setValue();
//         A a1 = new A();
//         A a2 = new A();
//         a1.fun1();
//         // a2.fun3();
//         a1.fun2();
// int s =0;
//         for(int j=0;j<args.length;j++){
// s = s + Integer.parseInt(args[j]);

//         }
//         System.out.println("Average is :"+s/args.length);
System.out.println("Hello");


C c1 =new C();
c1.display();
c1.print();
A a1 =new A();
a1.main();
System.out.println(D.x);
D.callMe();


        
          

        
    }
}
