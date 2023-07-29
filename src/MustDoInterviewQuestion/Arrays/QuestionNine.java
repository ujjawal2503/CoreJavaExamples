package MustDoInterviewQuestion.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sort012(a);
        System.out.println("no of triplets ---" + Arrays.toString( a));
    }

    public static void sort012(int []nums){/*
        int one=0,two=0,zero =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]== 0)
                zero++;
            else if(arr[i]==1)
                one++;
            else
                two++;
        }
        int k = 0;
            for (int i = 0; i < zero; i++) {
                arr[k++]=0;
            }
            for (int j = 0; j < one; j++) {
                arr[k++]=1;
            }
            for (int l = 0; l < two; l++) {
                arr[k++] = 2;
            }*/
        int low=0;
        int high=nums.length-1;
        int mid=0;
        int temp;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1)
            {
                mid++;
            }else if(nums[mid]==2)
            {
                temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
    }

