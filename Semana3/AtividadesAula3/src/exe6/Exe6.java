package exe6;

import java.util.Scanner;

public class Exe6 {
	public static int area(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura do retangulo: ");
		a = sc.nextInt();
		System.out.println("Digite a largura do retangulo: ");
		b = sc.nextInt();
		
		System.out.println("Area do retangulo: " + area(a, b));
	}
}
