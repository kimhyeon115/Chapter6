package Chapter_result;

public class SungJuk {
	String name;
	int kor;
	int mat;
	int eng;
	String address;
	int total;
	int avg;
	
	void SungJukInfo() {
		total = kor + eng + mat;
		avg = total / 3;
		System.out.println("이름 : " + name);
		System.out.println("국어 성적 : " + kor);
		System.out.println("영어 성적 : " + eng);
		System.out.println("수학 성적 : " + mat);
		System.out.println("합계 점수 : " + total);
		System.out.println("평균 점수 : " + avg);
		System.out.println("주소 : " + address);
	}

}
