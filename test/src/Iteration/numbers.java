package Iteration;

public class numbers {
	public static void main(String[] args){
		String[] tens = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String[] units = {"one","two","three","four","five","six","seven","eight","nine"};
		String[] onety = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	
		for(String u : units) {
			System.out.println(u);
		}
		for(String o : onety) {
			System.out.println(o);
		}
		for(String t : tens) {
			for(int i = 0; i <= 9;i++) {
				if(i == 0) {
					System.out.println(t);
				} else {
					System.out.println(t+"-"+units[i-1]);
				}
			}
		}
	}
}
