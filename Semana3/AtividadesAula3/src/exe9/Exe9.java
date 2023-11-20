package exe9;

import java.util.Scanner;

public class Exe9 {
	public static float soma(float a, float b) {
		return a + b;
	}

	public static float subtracao(float a, float b) {
		return a - b;
	}

	public static float multiplicacao(float a, float b) {
		return a * b;
	}

	public static float divisao(float a, float b) {
		return a / b;
	}

	public static void main(String[] args) {
		float a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		a = Float.parseFloat(sc.nextLine());
		System.out.println("Digite o segundo numero: ");
		b = Float.parseFloat(sc.nextLine());
		
		String opcao;
		System.out.println("Digite a operacao desejada (Adicao = A, Subtracao = S, Multiplicacao = M, Divisao = D): ");
		opcao = sc.nextLine();
		switch(opcao){
		case "A":
			System.out.println("Adicao: " + soma(a, b));
			break;
		case "S":
			System.out.println("Subtracao: " + subtracao(a, b));
			break;
		case "M":
			System.out.println("Multiplicacao: " + multiplicacao(a, b));
			break;
		case "D":
			System.out.println("Divisao: " + divisao(a, b));
			break;
		}
	}
}
