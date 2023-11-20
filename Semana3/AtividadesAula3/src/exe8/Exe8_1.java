package exe8;

import java.util.Scanner;

public class Exe8_1 {
	public static void main(String[] args) {
		int idade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		if(idade >= 18)
			System.out.println("Voce e maior de idade");
		else		
			System.out.println("Voce e menor de idade");
	}
}
