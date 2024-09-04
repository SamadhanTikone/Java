 class A {
   final void show(){
        System.out.println("Hello I am in the A show");
    }
}

class B extends Fourth{
     void show2(){
        System.out.println("Hello I am in the B show");
    }
}
class C extends Fourth{
     void show3(){
        System.out.println("Hello I'm in the C show");
        // System.out.println();
    }
}

class First{

    static void show(){
        System.out.println("DSfghjkl");
    }

public static void main(String arg[]){
    show();

    Fourth obj = new B();
    obj.show();

    B obj1 = (B)obj;
    obj1.show2();

// B obj1= new B();
// obj1.show();

// C obj2= new C();
// obj2.show();



}

}