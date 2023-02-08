package overloading;

public class overloading {
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(double a, double b) {
		System.out.println(a+b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		overloading obj=new overloading();
		obj.sum(1, 1);
		obj.sum(1.1, 2.2);
		obj.sum(1, 2, 3);
	}
}
