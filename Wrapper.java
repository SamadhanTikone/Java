class Object
{

     int x= 20;

    void fun1(){

        System.out.println(x);
        
    }
    void fun2(){

        System.out.println(x);

    }




}



class Wrapper {



public static void main(String arg[]){

// Object b1 = new Object();
// Object b2 = new Object();
// b1.x = 60;
// b2.x = 9000;

// System.out.println(b1.x);
// System.out.println(b2.x);

// b1.fun1();
// b1.fun2();
// b2.fun1();
// b2.fun2();


StringBuffer b1 = new StringBuffer("SAM, ");
// int x = b1.ensureCapacity(100);
b1.setLength(30);


b1.append("Hello  ");
b1.append(" ");
b1.append("Public ");
b1.insert(10,12345667);

// int x = 222222;
// String a1 = x.toString();

// System.out.println(a1);

// String s1 = b1.toString();
// System.out.println(s1);



System.out.println(b1);
// System.out.println(x);




}

}