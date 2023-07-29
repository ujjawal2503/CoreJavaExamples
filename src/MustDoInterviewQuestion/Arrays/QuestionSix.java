package MustDoInterviewQuestion.Arrays;
/*Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

Example 1:

Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3 */

public class QuestionSix
{
    public static void rearrangeArray(int[] arr, int n) {
        int maxIdx = n - 1; // Index of the maximum element
        int minIdx = 0; // Index of the minimum element

        // Store the maximum element of the array plus one
        int maxElement = arr[maxIdx] + 1;

        // Traverse the array and modify elements at even and odd indices
        for (int i = 0; i < n; i++) {
            // At even indices, store the modified value
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % maxElement) * maxElement;
                System.out.println("Step ---"+arr[i]);
                maxIdx--;
            }
            // At odd indices, store the modified value
            else {
                arr[i] += (arr[minIdx] % maxElement) * maxElement;
                System.out.println("Step+++++---"+arr[i]);
                minIdx++;
            }
        }

        // Divide all the elements in the array by the maxElement
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int n = arr.length;

        rearrangeArray(arr, n);

        // Print the rearranged array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
