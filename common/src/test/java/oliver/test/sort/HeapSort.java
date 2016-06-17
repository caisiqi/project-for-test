package oliver.test.sort;

public class HeapSort {

	public static void sort(int[] a) {
		if (null == a || a.length == 0) {
			return;
		}
		buildMaxHeap(a);
		ArrayUtils.print(a);
		for (int i = a.length - 1; i >= 1; i--) {
			swap(a, 0, i);
			fixMaxHeap(a, i, 0);
		}
	}
	
	private static void buildMaxHeap(int[] a) {
		int n = a.length / 2;
		for (int i = n - 1; i >= 0; i--) {
			fixMaxHeap(a, a.length, i);
		}
	}
	
	private static void fixMaxHeap(int[] a, int size, int index) {
		int left = index * 2 + 1;
		int right = index * 2 + 2;
		int max = index;
		if (left < size && a[max] < a[left] ) {
			max = left;
		}
		if (right < size && a[max] < a[right]) {
			max = right;
		}
		if (max != index) {
			swap(a, max, index);
			fixMaxHeap(a, size, max);
		}
	}
	
	private static void swap (int[] a, int b, int c) {
		int tmp = a[b];
		a[b] = a[c];
		a[c] = tmp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = ArrayUtils.randomArray(20);
		ArrayUtils.print(a);
		sort(a);
		ArrayUtils.print(a);
	}

}
