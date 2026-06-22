class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];

        // Copy nums1
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < nums2.length; i++) {
            arr[i + nums1.length] = nums2[i];
        }

        Arrays.sort(arr);

        double ans;

        // Odd length
        if (n % 2 != 0) {
            ans = arr[n / 2];
        }
        // Even length
        else {
            ans = (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
        }

        return ans;
    }
}