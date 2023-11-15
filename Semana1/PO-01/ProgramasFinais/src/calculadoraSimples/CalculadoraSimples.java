package calculadoraSimples;

import java.util.Scanner;

public class CalculadoraSimples 
{
	public void soma(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	public void subtracao(int num1, int num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}
	
	public void multiplicacao(int num1, int num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}
	
	public void divisao(int num1, int num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
	
	public static void main(String[] args)
	{
		int num1, num2, operacao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		System.out.println("Digite a operacao: ");
		System.out.println("(1) - Soma");
		System.out.println("(2) - Subtracao");
		System.out.println("(3) - Multiplicacao");
		System.out.println("(4) - Divisao");
		
		operacao = sc.nextInt();
		CalculadoraSimples c = new CalculadoraSimples();
		
		switch(operacao) {
		case 1:
			c.soma(num1, num2);
			break;
		case 2:
			c.subtracao(num1, num2);
			break;
		case 3:
			c.multiplicacao(num1, num2);
			break;
		case 4:
			c.divisao(num1, num2);
			break;
			}
	}
}

