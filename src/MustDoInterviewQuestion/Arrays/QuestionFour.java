package MustDoInterviewQuestion.Arrays;
/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4*/

public class QuestionFour {
    public static int findMissing(int[] A, int N) {
        int xorResult = 0;

        // XOR all elements in the array
        for (int num : A) {
            xorResult ^= num;
            System.out.println(xorResult+"mmm");
        }

        // XOR numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            xorResult ^= i;
            System.out.println(xorResult+"nnn");
        }

        return xorResult;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,3, 5};
        int N = 5;

        int missingElement = findMissing(arr, N);
        System.out.println("Missing element: " + missingElement);  // Output: 4
    }
}
