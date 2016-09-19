package mathtest;

public class MathTest {

	public static void main(String[] args) {

		// Math math = new Math();
		// math.abs(-10);
		// 굳이 이렇게 안해도됨

		int i = Math.abs(-10);
		int j = Math.max(10, 20);
		//max(10,20);이라고 해도됨
		// 10 < -abs (-10)
	}

	static int max(int i, int j) {
		if (i > j) {
			return i;
		}
		return j;
	}

}
