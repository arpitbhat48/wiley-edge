
public class BinarySearch {

	// iterative
	public static void binarySearch(int a[], int To_Find) {
		int lo = 0, hi = a.length - 1;
		while (hi - lo > 1) {
			int mid = (hi + lo) / 2;
			if (a[mid] < To_Find) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		if (a[lo] == To_Find) {
			System.out.println("Found At Index " + lo);
		} else if (a[hi] == To_Find) {
			System.out.println("Found At Index " + hi);
		} else {
			System.out.println("Not Found");
		}
	}

	// recursive
	public static int binarySearch(int a[], int l, int r, int search) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (a[mid] == search)
				return mid;

			if (a[mid] > search)
				return binarySearch(a, l, mid - 1, search);

			return binarySearch(a, mid + 1, r, search);
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 10, 20, 22, 30, 55 };
		int search = 10;
		int n = arr.length;
		int res = binarySearch(arr, 0, n - 1, search);

		System.out.println("Found" + res);
		binarySearch(arr, search);
	}

}
