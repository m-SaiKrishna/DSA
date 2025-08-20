package TwoPointers;

public class MaxAverageSubArray {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = findMaxAverage(nums, k);
        System.out.println("Maximum average of subarray of size " + k + " is: " + result);
    }

    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        for (int i = 0; i <= nums.length - k; i++) {
            double currentSum = 0;
            for (int j = i; j < i + k; j++) {
                currentSum += nums[j];
            }
            double currentAverage = currentSum / k;
            maxAverage = Math.max(maxAverage, currentAverage);
        }
        return maxAverage;
    }
    }
