package com.company;

public class ArraysPS5Q {
    public static void main(String[] args) {
        // Q1 create an array of 5 floats and calculate their sum
//        float [] floats= {10.5f,20.5f,35.5f,40.5f,50.5f};
//        float sum = 0;
//        for (int i = 0; i < floats.length; i++){
//            sum += floats[i];
//        }
//        System.out.println(sum);

        //
//        float [] floats= {10.5f,20.5f,35.5f,40.5f,50.5f};
//        float num = 20.5f;
//        boolean IsinArray = false;//initialize boolean to false so that we can prove that is true
//        for (float element:floats){
//            if (element==num){
//                IsinArray = true;
//                break;
//            }
//        }
//        if (IsinArray){
//            System.out.print("The value is present in the array!");
//        }
//        else {
//            System.out.println("The value is not present in the array!");
//        }

        //Q3 avg marks from an array containing marks of all students in physics using for each loop
//        float[] marks = {6.78f,6.48f,7.21f};
//        float sum = 0;
//        for (float element : marks){
//            sum += element;
//        }
//        System.out.println("The Avg of all 5 students containing Physics marks is : " + sum/marks.length);

        //Q4 2 matrix addition
//        int [][] mat1  = { {1,2,3},
//                           {4,5,6} };
//        int [][] mat2 = {{5,1,8},
//                         {4,6,2} };
//        int [][] result = {{0,0,0},
//                           {0,0,0} };
//
//        // Setting the value of i & j
//        for (int i =0; i < mat1.length ; i++){
//            for (int j = 0; j < mat1[i].length ; j++){
//                System.out.printf("Setting The Value of  i = %d & j = %d\n",i,j);
//            }
//        }
//        //printing the elements of 2d array
//        for (int i =0; i < mat1.length ; i++){           //row number of times {row --> = 2} //mat1 pura array ka total length
//            for (int j = 0; j < mat1[i].length ; j++){    //column number of times{column --> 3}  // mat1[i] means first arrays length.
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }

        //To Reverse an ARRAY
//        int [] a = {1,2,3,4,5,6,5,2};
//        int l = a.length;
//        int n = Math.floorDiv(l,2);
//        int temp =0;
//
//        for (int i = 0; i < n ; i++){
//            //swap a[i] and { a[l-1-i] }--->formula
//            temp = a[i];
//            a[i] = a[l-1-i];
//            a[l-1-i] = temp;
//        }
//        for (int element: a){
//            System.out.print(element + " ");
//        }

        // Q6 find maximum element in array
//        int [] a = {1,2,3,4,5,6,55,500};
//        int max = Integer.MIN_VALUE;
//        for (int e: a){
//            if(e > max){
//                max = e;
//            }
//        }
//        System.out.print("The maximum value of the array is : " + max);

        //Q7 minimum value in array
//        int [] a = {3000,2,3,4,5,6,55,500};
//        int min = Integer.MAX_VALUE;
//        for (int e: a){
//            if(e < min){
//                min = e;
//            }
//        }
//        System.out.print("The maximum value of the array is : " + min);

        //Q8 To Find whether an array is Sorted Or Not?
        boolean IsSorted = true;
        int [] a = {100,200,300,400,500,655,700};
        for (int i=0;i < a.length -1 ; i++){
            if (a[i] > a[i+1] ) {
                IsSorted = false;
                break;
            }
        }
        if (IsSorted){
            System.out.println("The Array Is Sorted");
        }
        else {
            System.out.println("The Array is Not Sorted");
        }
        



    }
}
