package exe5;

import java.util.Scanner;

public class Exe5_2 {
	public static double conversor(double temp, int tipo) {
		if(tipo == 1)
			return (temp - 32) / 1.8;
		else
			return (temp * 1.8) + 32;			
	}
	
	public static void main(String[] args) {
		double temp;
		int tipo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura: ");
		temp = Double.parseDouble((sc.nextLine()));
		System.out.println("Ela e celsius(0) ou fahrenheit(1)?: ");
		tipo = sc.nextInt();

		System.out.println("Temperatura apos conversao: " + conversor(temp, tipo));
	}
}
