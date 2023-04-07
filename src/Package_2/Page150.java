package Package_2;

public class Page150 {

	public static void main(String[] args) {
		int[][] sk = {
				{91, 87, 79},
				{88, 70, 93},
				{98, 83, 68},
				{76, 90, 86}
		};
		//제목 인쇄
		System.out.println("번호 국어 수학 영어 합계 평균");
		System.out.println("-----------------------");
		for(int i=0; i<4; i++) {
			int sum = 0;
			int avg = 0;
			System.out.printf(" %d ",i+1);			//내부 반복전에 인쇄 (선두)
			for(int j=0; j<3; j++) {				//내부 반복 인쇄    
				sum += sk[i][j];
				System.out.printf(" %d ",sk[i][j]);
			}
			avg = sum / sk[i].length;				//내부 반복후 인쇄 및 개행 (후미)
			System.out.printf(" %d  %d ", sum, avg);
			System.out.println();
		}											//sk.length     열 길이
	}												//sk[i].length  행 길이
}
