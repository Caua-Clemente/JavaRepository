package exe2;

import java.util.Scanner;

public class Exe2 {
	public static float mediaPonderada(float nota1, float peso1, float nota2, float peso2, float nota3, float peso3) {
		return ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) / (peso1 + peso2 + peso3);
	}
	
	public static void main(String[] args) {
		float n1, n2, n3, p1, p2 ,p3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextFloat();
		System.out.println("Digite o peso do primeiro numero: ");
		p1 = sc.nextFloat();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextFloat();
		System.out.println("Digite o peso do segundo numero: ");
		p2 = sc.nextFloat();
		System.out.println("Digite o terceiro numero: ");
		n3 = sc.nextFloat();
		System.out.println("Digite o peso do terceiro numero: ");
		p3 = sc.nextFloat();
		
		System.out.println("A media ponderada dos valores digitados e = " + mediaPonderada(n1, p1, n2, p2, n3, p3));
	}
}
