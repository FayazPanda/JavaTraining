package Iteration;

public class Numbers {
	public static void main(String[] args){
		java.lang.String[] tens = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		java.lang.String[] units = {"one","two","three","four","five","six","seven","eight","nine"};
		java.lang.String[] onety = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

		for(java.lang.String u : units) {
			System.out.println(u);
		}
		for(java.lang.String o : onety) {
			System.out.println(o);
		}
		for(java.lang.String t : tens) {
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
