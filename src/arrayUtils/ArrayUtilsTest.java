package arrayUtils;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		
		// int 배열을 double 배열로 변환
		int[] arrayInt = { 10, 20, 30, 40, 50 };
		double[] arrayDouble = ArrayUtils.intToDouble(arrayInt);
		for (int i = 0; i < arrayDouble.length; i++) {
			System.out.println(arrayDouble[i]);
		}

		// double 배열을 int 배열로 변환
		double[] arrayDouble1 = { 10.1, 20.1, 30.1, 40.2, 50.5 };
		int[] arrayInt1 = ArrayUtils.doubleToInt(arrayDouble1);
		for (int i : arrayInt1) {
			System.out.println(i);
		}

		// int 배열 두 개를 연결한 새로운 배열 리턴
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 10, 20, 30, 40, 50 };
		int[] c = ArrayUtils.concat(a, b);
		for (int i : c) {
			System.out.println(i);
		}
	}
}
