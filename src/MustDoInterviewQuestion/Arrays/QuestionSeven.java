package MustDoInterviewQuestion.Arrays;
import java.util.Arrays;

public class QuestionSeven {

    public static int countPairs(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Sort both arrays
        Arrays.sort(X);
        Arrays.sort(Y);

        // Initialize count
        int count = 0;

        // Iterate over each element in X
        for (int i = 0; i < m; i++) {
            // If X[i] is 0, continue to next iteration
            if (X[i] == 0) {
                continue;
            }

            // If X[i] is 1, increment count by the number of 0's in Y
            if (X[i] == 1) {
                count += countZeros(Y);
                continue;
            }

            // Binary search to find the index of the smallest element greater than X[i]
            int left = 0;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (Y[mid] > X[i]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            // Add the count of elements greater than X[i] to the total count
            count += n - left;
        }

        return count;
    }

    // Helper method to count the number of 0's in an array
    private static int countZeros(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] X = {2, 1, 6};
        int[] Y = {1, 5};
        System.out.println(countPairs(X, Y)); // Output: 3
    }
}