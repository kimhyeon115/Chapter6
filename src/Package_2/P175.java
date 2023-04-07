package Package_2;
class Card{
	String kind;
	int number;
	static int width;
	static int height;
	void showMethod() {
		System.out.println(kind);
	}
}

public class P175 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		Card.width = 30;
		Card.height = 40;
		
		System.out.println(c1.width);
		System.out.println(c2.width);
	}

}
