package Chapter_result;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		sj.name = scn.nextLine();
		System.out.println("국어 성적을 입력하세요");
		sj.kor = scn.nextInt();
		System.out.println("영어 성적을 입력하세요");
		sj.eng = scn.nextInt();
		System.out.println("수학 성적을 입력하세요");
		sj.mat = scn.nextInt();
		System.out.println("주소를 입력하세요");
		sj.address = scn.next();				//nextLine 실행시 누락됨 주의!
		sj.SungJukInfo();
	}

}
