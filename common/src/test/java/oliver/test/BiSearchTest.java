package oliver.test;

public class BiSearchTest {

	public static int search(int[] a, int b) {
		if (null == a || a.length == 0) {
			return -1;
		}
		int high = a.length - 1;
		int low = 0;
		while (low < high) {
			int mid = (high + low) / 2;
			if (a[mid] == b) {
				return mid;
			}
			else if (a[mid] < b) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			} 
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(search(a, 8));
	}

}
