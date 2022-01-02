public class dec20 {
	public static int First(int t) {
		int[] arr = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 6 };

		int start = 0;
		int count = 0;

		int end = arr.length - 1;
		int f = -1;

		while (start <= end) {
			int mid = start + (end - start);

			if (t == arr[mid]) {
				count = count + 1;
				end = mid - 1;

			} else if (t < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return count;

	}

	public static int last(int t) {

		// frequancy of target number_____________________________________________
		int[] arr = { 1, 2, 3, 3, 3, 3, 3, 4, 5, 6 };
		int count1 = 0;
		int start = 0;

		int end = arr.length - 1;

		int l = -1;

		while (start <= end) {
			int mid = start + (end - start);

			if (t == arr[mid]) {
				count1 = count1 + 1;
				start = mid + 1;

			} else if (t < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return count1;

	}

	public static void main(String[] args) {
		int a = First(3);
		int b = last(3);
		int c = (a + b) - 1;
		System.out.println("Sum of Index:  " + c);
	}

}