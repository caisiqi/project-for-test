package oliver.test.sort;

public class QuickSort {

	public static void sort(int[] a) {
		if (null == a || a.length == 0) {
			return;
		}
		doSort(a, 0, a.length - 1);
	}

	private static void doSort(int[] a, int left, int right) {
		if (left >= right) {
			return;
		}
		int i = left;
		int j = right;
		int x = a[i];
		while  (i < j) {
			while (i < j && a[j] >= x) {
				j--;
			}
			a[i] = a[j];
			while (i < j && a[i] < x) {
				i++;
			}
			a[j] = a[i];
		}
		a[i] = x;
		doSort(a, left, i - 1);
		doSort(a, j + 1, right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = ArrayUtils.randomArray(50);
		ArrayUtils.print(a);
		sort(a);
		ArrayUtils.print(a);
	}

}
