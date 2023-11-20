package exe3;

import java.util.Scanner;

public class Exe3 {
	public static String concatenar(String s1, String s2) {
		return (s1 + s2);
	}
	
	public static String criarString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma string: ");
		return sc.nextLine();
	}

	public static void exibirString(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		String s1, s2, s3;
		s1 = criarString();
		s2 = criarString();
		
		System.out.println("String 1: ");
		exibirString(s1);
		System.out.println("String 2: ");
		exibirString(s2);
		
		s3 = concatenar(s1, s2);
		System.out.println("String concatenada: " + s3);
	}
}
