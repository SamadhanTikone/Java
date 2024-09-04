public class Third{

    public static void main(String[] args) {
        Car obj = new Car(){
           public void drive(){
                System.out.println("ooooooooooooooo");
            }

        };
        obj.show();
        obj.drive();
        // obj.hello();

        
    }
}

abstract class Car{

    public abstract  void drive();

    void show(){
        System.out.println("In SHOW");
    }
}

// class Tata extends Car{

//    public void drive(){
//         System.out.println("In DRIVE");

//     }
   
//     void hello(){
//         System.out.println("I am  DRIVEr");

//     }
// }