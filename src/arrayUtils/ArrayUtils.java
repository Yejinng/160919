package arrayUtils;

public class ArrayUtils {

	public static double[] intToDouble(int[] a) {
		if (a == null) {
			return null;
		}

		int length = a.length;
		double[] result = new double[length];

		for (int i = 0; i < length; i++) {
			result[i] = a[i];
			// result[i] = (double)a[i];
			// 오른쪽이 짧으니까 자동으로 double로 잡힘
		}
		return result;
	}

	public static int[] doubleToInt(double[] d) {
		if (d == null) {
			return null;
		}
		int length = d.length;
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			result[i] = (int) d[i];
		}
		return result;
	}

	public static int[] concat(int[] a, int[] b) {
		int length1 = (a == null) ? 0 : a.length;
		// if문으로 해도됨
		int length2 = (b == null) ? 0 : b.length;
		int length = a.length + b.length;
		int[] result = new int[length];
		int index = 0; // index이용...?
		
		for (int i = 0; i < length1; i++) {
			result[index] = a[i];
			index++;
		}
		for (int i = 0; i < length2; i++) {
			result[index] = b[i];
			index++;
		}
		return result;
	}
}
