

class Second{
 public static void main(String[] args) {
    Test obj1 = new Test();
    obj1.x=80;
    obj1.y="Hello";

   //  System.out.println(obj1);
   Test obj2 = new Test();
   obj2.x=80;
   obj2.y="Helloooo";

   boolean result = obj1.equals(obj2);
   System.out.println(result);
     
 }



}

 class Test{

int x;
String y ;


 public String toString(){

   return x + " "+ y;
 }

 public boolean equals(Test that){

   if(this.y.equals(that.y)&& this.x==that.x){
      return true;
   }
   else 
   return false;
 }

    
}