package MustDoInterviewQuestion.Arrays;


import java.util.ArrayList;
import java.util.Scanner;

/*Example 1:

Input:

N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.*/
public class QuestionOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i]= sc.nextInt();
        }
        ArrayList<Integer> res = subarraySum(a,n,s);
        for (Integer e:res
             ) {
            System.out.print(e+" ");
        }
    }
    static ArrayList<Integer> subarraySum(int[] A, int n, int S) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = -1, right = -1;
        int currentSum = 0;

        if (S == 0) {
            result.add(-1); // No subarray found
            return result;
        }
        for (int i = 0; i < A.length; i++) {
            currentSum += A[i];
            while (currentSum > S) {
                currentSum -= A[left + 1];
                left++;
            }

            if (currentSum == S) {

                right = i;
                System.out.println(left + "         " + right);
                result.add(left + 2);  // 1-based indexing for left
                result.add(right + 1); // 1-based indexing for right
                return result;
            }
        }

        result.add(-1); // No subarray found
        return result;
    }}
/*N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets:
 1 + 2 = 3 and 3 +2 = 5

Example 2:

Input:
N = 3
arr[] = {2, 3, 4}
Output: 0
*/
