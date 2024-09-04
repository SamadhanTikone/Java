import java.util.Scanner;

class A {

    // public void run(){
    // int i;
    // for(i=1;i<=10;i++){
    //     System.out.println("Process 1 :"+i);
    // }
// }
int bal;
A(int b){
    bal =b;

}

boolean isOk(int amt){
    if(bal>amt){
        return true;
    }
    else
    {
        return false;
    }
}

void withDraw(int amt){
    bal = bal - amt;
    System.out.println("Transition Successful");
    System.out.println("REmaining Balance:"+ bal);

}


}
class B extends  Thread{

//     public void run(){
//     int i;
//     for(i=1;i<=10;i++){
//         System.out.println("Process 2 :"+i);
//     }
// }

A x1;

B(A a){
    x1 = a;
}
void customer(){
synchronized (x1) {
    
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter Amount:");
    int amt = s1.nextInt();
   
    if(x1.isOk(amt)){
        x1.withDraw(amt);
    }
    else{
        System.out.println("Insufficient Balance");
    }

}
}


}





public class MultiThread {
    public static void main(String[] args) {
        A a1 = new A(5000);
        B b1 = new B(a1);
        B b2 = new B(a1);
        // Thread t1 = new Thread(b1);
        // Thread t2 = new Thread(b2);
        
        b1.start();
        b2.start();


        
    }
}
