package MustDoInterviewQuestion.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        leaders(a,a.length).stream().forEach(System.out::println);
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> leaderList = new ArrayList<>();
        for (int i = 1; i < n-1; i++) {
            if(arr[i]>arr[i-1]&& arr[i]>arr[i+1])
                leaderList.add(arr[i]);
        }
        leaderList.add(arr[n-1]);

        return leaderList;

    }
}
