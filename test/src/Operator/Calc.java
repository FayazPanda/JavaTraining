package Operator;

public class Calc {
	public static void main(String[] args){
		System.out.println("Hello World");
	}
	
	static int add(int x, int y) {
		return x + y;
	}
	
	static int sub(int x, int y) {
		return x - y;
	}
	
	static int mul(int x, int y) {
		return x * y;
	}
	
	
	static double div(double x, double y) {
		if(x>y) {
			return x / y;
		} else {
			System.out.println("Error");
			return x;
		}
		
	}

}
