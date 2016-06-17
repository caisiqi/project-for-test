package oliver.test.sort;

public class MergeSort {

	public static void sort(int[] a) {
		if (null == a || a.length == 0) {
			return;
		}
		doSort(a, 0, a.length - 1);
	}
	
	private static void doSort(int[] a, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			doSort(a, left, mid);
			doSort(a, mid + 1, right);
			merge(a, left, right, mid);
		}
	}
	
	private static void merge(int[] a, int left, int right, int mid) {
		int[] b = new int[right - left + 1];
		//左数组的下标
		int i = left; 
		 //右数组的下标
		int j = mid + 1;
		//数组b的下标
		int p = 0;
		while (i <= mid && j <= right) {
			if (a[i] < a[j]) {
				b[p++] = a[i++]; 
			}
			else {
				b[p++] = a[j++];
			}
		}
		while (i <= mid) {
			b[p++] = a[i++];
		}
		
		while (j <= right) {
			b[p++] = a[j++];
		}
		
		for (int n = 0; n < b.length; n++) {
			a[left + n] = b[n];
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = ArrayUtils.randomArray(20);
		ArrayUtils.print(a);
		sort(a);
		ArrayUtils.print(a);
	}

}
