class array{
    public static void main(String arg[]){

        // int arr[]=new int[6];
        // arr[0]=10;
        // arr[1]=20;
        // arr[2]=30;
        // arr[3]=40;

        // for(int i =0 ; i<6;i++){
        //     System.out.println(arr[i]);
        // }

        Test s1 = new Test();
        s1.rollno =1;
        s1.name ="Sam";
        s1.marks = 90;

        Test s2 = new Test();
        s2.rollno =2;
        s2.name ="Ram";
        s2.marks = 89;

 Test students[] = new Test[2];
  
  students[0]= s1;
  students[1]= s2;
//   for(int i =0; i<students.length;i++){

// System.out.println(students[i].rollno + " : " + students[i].name);

//   }
        
        for(Test stud : students){
          System.out.println(stud.rollno + " : " + stud.name);


        }

    }
}

class Test{
    int rollno;
    String name;
    int marks;
}