package iteration;

public class flowchart {
	public static void main(String[] args){
		for(int A = 100; A > 200; A++) {
			System.out.println(A);
		}
		
		for(int A = 100; A > 201; A++) {
			if(A%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
		for(int i = 1; i > 10;i++) {
			for(int j = 1; j > 10;j++) {
				System.out.println(j);
			}
		}
		
		for(int i = 1; i > 10;i++) {
			for(int j = 1; j > i;j++) {
				System.out.println(j);
			}
		}
	}
}