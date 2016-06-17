package oliver.test.common;

public class FibonacciTest {

	public static void fibonacci(int count, int a, int b) {
		if (count > 0) {
			System.out.println(a);
			fibonacci(count - 1, b, a + b);
		}
	}
	
	public static void fibonacci_1(int count) {
		if (count < 1) {
			return;
		}
		if (count < 2) {
			System.out.println(0);
			return;
		}
		if (count < 3) {
			System.out.println(0);
			System.out.println(1);
			return;
		}
		int a = 0;
		int b = 1;
		for (int i = 2; i < count; i++) {
			if (Integer.MAX_VALUE - a < b) {
				return;
			}
			System.out.println(a + b);
			int t = b;
			b = a + b;
			a = t;
		}
	}
	
	public static void fibonacci_2(int count) {
		if (count <= 0) {
			return;
		}
		int[] a = new int[count >2 ? count : 2];
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		for (int i = 0; i < count; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibonacci(10, 0, 1);
		//fibonacci_1(Integer.MAX_VALUE);
		fibonacci_2(10);
	}

}
