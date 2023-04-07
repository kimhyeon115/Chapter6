package Package_2;

public class Test {

	public static void main(String[] args) {
		int[][] sk2 = {{100, 100},{150, 250}};
		int sum = 0;
		System.out.println("  A    B   합계  ");
		for(int i=0; i<sk2.length; i++) {
			for(int j=0; j<sk2[i].length; j++) {
				sum += sk2[i][j];
				System.out.printf(" " + sk2[i][j] + " ");
			}
			System.out.printf(" " + sum + " ");
			System.out.println();
		}
		
	}

}
