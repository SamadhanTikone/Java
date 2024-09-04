import java.io.File;
import java.io.FileOutputStream;
// Importing the IOException class for handling errors  
import java.io.IOException;   
 class CreateFile {  
               public static void main(String args[]) {  
               try {  
                       // Creating an object of a file  
                //        File f0 = new File("D:FileOperationExample.txt");   
                //        if (f0.createNewFile()) {  
                //                   System.out.println("File " + f0.getName() + " is created successfully.");  
                //        } else {  
                //                   System.out.println("File is already exist in the directory."); 
                //                   System.out.println(f0.length()); 
                //                   System.out.println(f0.getAbsolutePath());
                //                   System.out.println(f0.getName());
                //                   System.out.println(f0.canRead());
                //                   System.out.println(f0.canWrite());
                //                   System.out.println(f0.list());
                //        }  
                //      } catch (IOException exception) {  
                //               System.out.println("An unexpected error is occurred.");  
                //               exception.printStackTrace();  
                //   } 
                
                String s1 = "Welcome To Home.";

                FileOutputStream  f1= new FileOutputStream("D:FileOperationExample.txt",true);

                char[] c1 = s1.toCharArray();
                for(int i =0; i<c1.length;i++){

                        f1.write(c1[i]);

                }
                f1.close();
               }

               catch (IOException e){
                System.out.println(e);

               }

                  
        }  
}  