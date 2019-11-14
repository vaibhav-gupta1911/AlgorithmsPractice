package Leetcode;

public class GOOGLE_LargestSubarrayK {

	public static void main(String[] args) {

		int k = 3;
		int[] a = { 5, 5, 5, 4, 6, 7 };

		largestSubArray(k, a);

//		for (int i = maxStartIndex; i < maxStartIndex + k; i++) {
//
//			System.out.println(a[i]);
//		}
	}

	private static int[] largestSubArray(int k, int[] a) {
		int maxno = Integer.MIN_VALUE;
		int maxStartIndex = 0;
		int[] largestSubArr = new int[k];

		// find the Maximum number within the range,
		// as we don't need to check sub-arrays starting with smaller numbers
		for (int x = 0; x <= a.length - k; x++) {
			if (a[x] > maxno)
				maxno = a[x];
		}

		for (int x = 0; x <= a.length - k; x++) {
			if (a[x] == maxno) // check only for maximum number..reducing the number of comparisons
				maxStartIndex = largestArray(maxStartIndex, a, x, k);
		}

		
		for (int i = maxStartIndex; i < maxStartIndex + k; i++) {   // fill the final largest array
			largestSubArr[i - maxStartIndex] = a[i];
		}

		return largestSubArr;
	}

	private static int largestArray(int maxIndex, int[] a, int x, int k) {

		for (int i = 0; i <= k - 1; i++) {
			if (a[maxIndex + i] < a[x + i]) {
				return x;
			}
			if (a[maxIndex + i] > a[x + i]) {
				return maxIndex;
			}
		}

		return maxIndex;
	}

}
