package MustDoInterviewQuestion.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Example 1:

Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets:
 1 + 2 = 3 and 3 +2 = 5

Example 2:

Input:
N = 3
arr[] = {2, 3, 4}
Output: 0
Explanation: No such triplet exits*/
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("no of triplets ---" + countTriplet(a));
    }

    private static int countTriplet(int[] a) {
        int count=0;
        int n = a.length;
        Arrays.sort(a);
        for (int i = 2; i <n ; i++) {
            int left = 0;
            int right = i-1;
            while (left<right){
                if(a[left]+a[right]<a[i])
                    left++;
                else if (a[left]+a[right]>a[i]) {
                  right--;}
                  else{
                    System.out.println(left+"  "+right);
                      count++;
                      right--;
                      left++;
                }
            }
        }

        return count;

    }
   /* static  int countTriplet(int arr[], int n) {
        int left = 1;
        int right = 2;
        Arrays.sort(arr);
        int count = 0;
        System.out.println(Arrays.toString(arr));
        while (right <=n - 1) {
            System.out.println(left+"  "+right);
            if (arr[left - 1] + arr[left] == arr[right])
                count++;

            left++;
            right++;

        }
        return count;
    }*/
}