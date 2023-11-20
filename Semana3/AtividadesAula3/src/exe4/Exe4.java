package exe4;

import java.util.Scanner;

public class Exe4 {
	public static void paridade(int x) {
		if(x%2 == 0)
			System.out.println(x + " e um numero par");
		else
			System.out.println(x + " nao e um numero par");
	}
	
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		x = sc.nextInt();
		paridade(x);
	}
}
