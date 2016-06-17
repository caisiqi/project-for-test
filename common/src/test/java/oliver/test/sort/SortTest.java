package oliver.test.sort;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		int[] a = ArrayUtils.randomArray(10000);
//		ArrayUtils.print(a);
		int[] a0 = Arrays.copyOf(a, a.length);
		int[] a1 = Arrays.copyOf(a, a.length);
		int[] a2 = Arrays.copyOf(a, a.length);
		int[] a3 = Arrays.copyOf(a, a.length);
		long begin, end;
	
//		ArrayUtils.print(a0);
		begin = System.currentTimeMillis();
		InsertSort.sort(a0);
		end = System.currentTimeMillis();
		System.out.println("InsertSort: " + (end - begin));
		
//		ArrayUtils.print(a1);
		begin = System.currentTimeMillis();
		QuickSort.sort(a1);
		end = System.currentTimeMillis();
		System.out.println("QuickSort: " + (end - begin));
	
//		ArrayUtils.print(a2);
		begin = System.currentTimeMillis();
		MergeSort.sort(a2);
		end = System.currentTimeMillis();
		System.out.println("MergeSort: " + (end - begin));
		
//		ArrayUtils.print(a3);
		begin = System.currentTimeMillis();
		HeapSort.sort(a3);
		end = System.currentTimeMillis();
		System.out.println("HeapSort: " + (end - begin));
	
		if (Arrays.equals(a0, a1)) {
			System.out.println("equals");
		}
		if (Arrays.equals(a0, a2)) {
			System.out.println("equals");
		}
		if (Arrays.equals(a0, a3)) {
			System.out.println("equals");
		}
		
	}

}
