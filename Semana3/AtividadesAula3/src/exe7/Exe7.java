package exe7;

public class Exe7 {
	public static void main(String[] args) {
		int a = 1000; int b = 5;
		
		System.out.println(a + " --- " + b);
		
		int c = 1000;
		a = b;
		b = c;

		System.out.println(a + " --- " + b);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println(a + " --- " + b);
	}
}
