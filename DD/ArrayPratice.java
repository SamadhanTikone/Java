class A {
 
    void array(int[] arr){
    // int[] array1 = new int[5];
    //     array1[1]= 25;

  for(int i =0; i<arr.length ; i++){
    // arr[i] = i*5;
    System.out.print(arr[i]+" ");

  }

System.out.println();
System.out.println();
System.out.println();
}

//   int findSum(int n){
//     return n *(n+1)/2;
// }
// public int findSum(int n){
//     int sum =0;
//     for(int i =0 ; i<=n; i++){
//         sum = sum+i;
//     }
//     return sum;
// }

// int[] removeEven(int[] arr){

//     int oddInd = 0 ;

//     for(int i = 0; i<arr.length;i++){
//         if(arr[i] % 2 !=0){
//             oddInd++;
//         }
//     }
//     int[] result = new int[oddInd];
//  int idx =0;
//      for(int i =0 ; i <arr.length ; i++){
//         if(arr[i] % 2 != 0){
//             result[idx] = arr[i];
//             idx++;
//         }
        
//      }


//     return result;
//     // System.out.println(result[]);
// }


///Reverse an Array

void reverseAnArray(int[] arr, int start,  int end){
    while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
        start++;
        end--;
    }

}

int minimumInArray(int[] arr){
    int min = arr[0];
    for(int i =1; i<arr.length;i++){
        if(arr[i]>min){
            min = arr[i];
        }

    }
    return min;
}

int returnSecondMax(int[] arr){
    int max =Integer.MIN_VALUE;
    int secondMax =Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            secondMax=max;
            max=arr[i];
        }
        else if(arr[i]>secondMax && arr[i]!=max){
            secondMax=arr[i];
        }
    }
    return secondMax;

}



}


public class ArrayPratice {

    public static void main(String[] args) {
        A a1= new A();
         int[] arr = {12,11,7,88,25,6,45,4,8};
         a1.array(arr);
        //  int[] result = a1.removeEven(arr);

        //  a1.array(result);
        a1.reverseAnArray(arr, 0,arr.length-1);
        a1.array(arr);

        int min= a1.minimumInArray(arr);
        System.out.println(min);

        int result=a1.returnSecondMax(arr);
        System.out.println("Second Max Value is :"+result);

        
        
    }
    
}
