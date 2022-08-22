package gittest;

public class helo {
	public static void main(String[] args) {
		System.out.println("hello");
		Math cMath = new Math();
		System.out.println(cMath.add(2, 4));
	}
}
class Math{
	int add(int a, int b) {
		return a + b;
	}
	int mul(int a, int b) {
		return a * b;
	}
}