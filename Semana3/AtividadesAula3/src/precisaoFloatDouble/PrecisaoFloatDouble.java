package precisaoFloatDouble;

public class PrecisaoFloatDouble {
	public static void main(String[] args) {
		float x, y;
		x = 2;
		
		do {
			y = x;
			x = x/2;
		} while (x>0);
		System.out.println(y);
		
		double a, b;
		a = 2;
		
		do {
			b = a;
			a = a/2;
		} while (a>0);
		System.out.println(b);
	}
}
