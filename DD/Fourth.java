import java.lang.Exception;
public class Fourth {
   
    public static void main(String[] args) {



        String s1 = "java";
        String s2 = new String("java");
        System.out.println(s1==s2);

        int i =0;
        int j =0;
        int nums[]= new int[5];
        String s =null;

        
        try
        {
            j = 200/i;
            System.out.println(s.length());
            System.out.println(nums[0]);
            System.out.println(nums[5]);

        }
        // catch(ArithmeticException e){
        //     System.out.println("Canot divide byu Zero");
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Error of Array");
        //    }
        catch(Exception e){

            System.out.println("Error Occured");
        }


        System.out.println(j);

        System.out.println("hello");
        
 
}


};





