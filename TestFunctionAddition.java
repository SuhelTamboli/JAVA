//4:Write functions for making addition of diffrent types(use FunctionOverloading);

public class TestFunctionAddition {

	public static void add() {
		int a = 10, b = 20, res;
		res = a + b;
		System.out.println("addition =" + res);

	}

	public static void add(int n1, int n2) {
		int res = n1 + n2;
		System.out.println("addition =" + res);

	}

	public static void add(double n1, int n2) {
		double res = n1 + n2;
		System.out.println("addition =" + res);

	}

	public static void add(String s1, String s2) {
		String s = s1 + s2;
		System.out.println("addition =" + s1 + s2);
	}

	public static void main(String[] args) {
		add();
		System.out.println("-----------------------------");

		int a = 20, b = 20;
		add(a, b);
		System.out.println("-----------------------------");

		double d = 20;
		int c = 50;
		add(d, c);
		System.out.println("-----------------------------");

		String s1 = "hello";
		String s2 = "world";
		add(s1, s2);

	}

}
