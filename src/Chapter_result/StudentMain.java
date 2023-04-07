package Chapter_result;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentID = 2023001;
		s1.studentName = "이순신";
		s1.grade = 4;
		s1.address = "인천";
		
		Student s2 = new Student();
		s2.studentID = 2023002;
		s2.studentName = "김유신";
		s2.grade = 3;
		s2.address = "서울";
		
		s1.StudentInfo();
		System.out.println();
		s2.StudentInfo();
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
