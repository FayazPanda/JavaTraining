package Conditional;

public class Blackjack {
	public static void main(String[] args){
		System.out.println("Hello World");
	}
	
	public int hitme(int x,int y) {
		if(x <= 21 && y <= 21) {
			if(x > 21) {
				return y;
			} else if(y > 21) {
				return x;
			} else {
				if(x == 21 || y == 21) {
					return 21;
				} else {
					if(x > y) {
						return x;
					} else {
						return y;
					}
				}
			}
		} else {
			return 0;
		}
	}
}
