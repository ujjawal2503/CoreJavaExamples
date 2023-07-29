package MustDoInterviewQuestion.Arrays;

import java.util.Scanner;

/*Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
Example 1:
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which
is a contiguous subarray.*/

//Maximum Subarray Sum: Kadane’s Algorithm
public class QuestionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Max sum ---"+maxSum(a));
    }

    static long maxSum(int arr[]){
    int n = arr.length;
    long maxSum = Integer.MIN_VALUE;
    long currSum = 0;

        for (int i = 0; i <= n - 1; i++) {
        currSum += arr[i];

        if (currSum > maxSum) {
            maxSum = currSum;
        }

        if (currSum < 0) {
            currSum = 0;
        }
    }

        return maxSum;}
}
