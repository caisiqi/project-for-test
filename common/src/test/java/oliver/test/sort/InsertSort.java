package oliver.test.sort;

public class InsertSort {

	public static void sort(int a[])  
	{  
		for (int i = 1; i < a.length; i++) {
			if (a[i-1] > a[i]) {
				int tmp = a[i];
				int j = i;
				while (j > 0 && a[j - 1] > tmp) {
					a[j] = a[j-1];
					j--;
				}
				a[j] = tmp;
			}
		}
	}  
	
	public static void main(String[] args){  
	    int a[] = ArrayUtils.randomArray(20);
	    ArrayUtils.print(a);
	    sort(a);
	    ArrayUtils.print(a);
	}  
	
}
