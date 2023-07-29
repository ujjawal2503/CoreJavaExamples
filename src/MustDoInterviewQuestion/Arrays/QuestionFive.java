package MustDoInterviewQuestion.Arrays;

import java.util.Arrays;

public class QuestionFive {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        int n = arr1.length;
        int m = arr2.length;

        mergeArrays(arr1, arr2, n, m);

        System.out.println("arr1 after merging: " + Arrays.toString(arr1));
        System.out.println("arr2 after merging: " + Arrays.toString(arr2));
    }
    public static void mergeArrays(int[] arr1, int[] arr2, int n, int m) {
        int ptr1 = 0; // Index of the last element in arr1
        int ptr2 = 0; // Index of the last element in arr2
        // Index of the last element in the merged array

        // Merge the arrays by comparing elements from the end
        while(ptr1<n){
            if(arr1[ptr1]>arr2[ptr2]){
                System.out.println("Step "+"  "+arr1[ptr1]+"  "+arr2[ptr2]);
                int temp = arr1[ptr1];
                arr1[ptr1] =arr2[ptr2];
                arr2[ptr2] =temp;
                ptr1++;
                System.out.println(Arrays.toString(arr1));
                System.out.println(Arrays.toString(arr2));
            }
            else{
                System.out.println("step ----");
                ptr1++;
            }

        }
    }
    }




