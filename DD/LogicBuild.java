import java.util.Scanner;
import java.util.*;


public class LogicBuild {
    public static void main(String []arg){
        Scanner s1 = new Scanner(System.in);

        /////////////////////ODD OR EVEN
        System.out.println("Enter a Number:-");
        int a =s1.nextInt();

        if(a%2==0){
            System.out.println(a+" is an Even Number.");
        }
        else{
        System.out.println(a+" is an odd Number.");
        }

////////////////////////ADD TWO NUMBERS
        System.out.println("Enter a Number:-");
        int b = s1.nextInt();
        int result = a+b;
        System.out.printf("%d + %d = %d",a,b,result);
        System.out.println("");
        // System.out.println(result);

        //////////////////LARGEST NUMBER
        System.out.println("Enter a Number:-");
        int c = s1.nextInt();
        if(a>b&& a>c){
            System.out.println("A is the largest Number.");
        }
        else if(b>a&&b>c){
            System.out.println("B is the largest Number.");

        }
        else if (c>a&&c>b){
            System.out.println("C is the largest Number.");

        }
        else{
            System.out.println("No One Is Greater");
        }
        s1.close();

        ////////////////////Multiplication Table

        for(int i = 1; i<=10;i++)
        {
            // System.out.println(c +"*"+ i = (c*i));
            System.out.printf("%d * %d = %d\n",c,i,(c*i));
        }


        ///////////////AREA OF THE CIRCLE
        // double PI = Math.sqrt(100);
        double PI = 3.14;
        int r = c;
        double area = PI * (r*r);
        System.out.println("Area of the Circle is the: "+area);


        ///////////////////DIVISIOR NUMBER

        for(int i =1;i<=c;i++){
            if(c%i==0){

                System.out.printf(" %d ",i);
            }

        }
        System.out.println(" ");
       if(c%b==0){
        System.out.println("B is Divisior of C");
       }

       //////////////////////FACTORIALOF NUMBERS 

       int number = c;
       int fac = 1;
       if(number<0){
        System.out.println("You Entered a Negative Number");

       }
       else if(number<=1){
        System.out.printf("%d! is %d",number, fac);
       }

       else{
        for(int i = number;i>=2;i--){
            fac = fac * i;
        }
        System.out.println("Factorial of given No. is: "+fac);
       }

    }

    
}
