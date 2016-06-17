package oliver.test.sort;

import java.util.Random;

public class ArrayUtils {

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] randomArray(int size) {
		int a[] = new int[size];
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			a[i] = r.nextInt(size);
		}
		return a;
	}

}
