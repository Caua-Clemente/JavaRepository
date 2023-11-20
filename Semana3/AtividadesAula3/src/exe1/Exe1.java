package exe1;

import java.util.Scanner;

public class Exe1 {
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		x = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		y = sc.nextInt();
		
		System.out.println("A soma de " + x + " + " + y + " = " + soma(x, y));
	}
}
