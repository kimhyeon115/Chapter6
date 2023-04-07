package Package_2;

public class Main_2 {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		Main ss = new Main();
		int sum = ss.add(num1,num2);
		System.out.println(sum);

	}
	int add(int n1, int n2) {
		int ss = n1 + n2;
		return ss;
	}

}
