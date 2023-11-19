package manipulaArray;

import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {
	private int[] lista = new int[10];
	
	public void numUsuario() {
		for(int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o " + (i+1) + " numero inteiro da lista: ");
			this.lista.add(sc.nextInt());
		}
	}
	
	public void numAleatorio() {
		
	}
	
	public int numMaior() {
		
	}

	public int numMenor() {
		
	}
}
