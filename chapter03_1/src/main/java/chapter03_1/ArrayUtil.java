package chapter03_1;

public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		double[] d = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			d[i] = a[i];

		}
		return d;
	}

	public static int[] doubleToInt(double[] d) {
		int [] a = new int[d.length];
		
		for (int i = 0; i < d.length; i++) {
			a[i] = (int)d[i];

		}
		return a;
	}
//
//	public static int[] concat(int[] s1, int[] s2) {
////		for (int i = 0)
////		return null;
//	}

}
