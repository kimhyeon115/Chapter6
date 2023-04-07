package Chapter_result;

import java.util.Scanner;

public class Page103Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Page103 ss = new Page103();
		System.out.println("성적을 입력하세요");
		ss.score = scn.nextInt();
		for(;ss.score > 100;) { 
			System.out.printf("성적은 100점을 초과할수 없습니다%n다시 입력하세요%n");
			ss.score = scn.nextInt();
		}
		ss.Page103Info();
	}

}
