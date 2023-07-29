
package MustDoInterviewQuestion.Arrays;

import java.util.Scanner;

public class QuestionTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(""+getQuilibrium(a,a.length));
    }
    public static  int getQuilibrium(int arr[],int n){
    if(n==1)
        return 1;
    int left=0;
    int right = n;
    long totalSum =0,rightSum =0,leftSum=0;
        for (int i = 0; i < n ; i++) {
            totalSum+=arr[i];
        }
        for (int j = 0; j < n; j++) {
            rightSum =totalSum-leftSum-arr[j];
            if(rightSum==leftSum)
                return j+1;
            leftSum+=arr[j];
        }
        return -1;
        //below solution going for TLE.
  /*  int mid = (left+right)/2;
    if(n==1)
        return 1;

        while(mid>1&& mid<n){
            System.out.println("step  1");
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<mid;i++)
            leftSum+=arr[i];

        for(int i=mid+1;i<right;i++)
            rightSum+=arr[i];
            System.out.println(leftSum+"    "+rightSum);
        if(leftSum>rightSum)
            mid--;
        else if (leftSum<rightSum)
            mid++;
        else
            return mid+1;

    }
        return -1;}*/
}
}

