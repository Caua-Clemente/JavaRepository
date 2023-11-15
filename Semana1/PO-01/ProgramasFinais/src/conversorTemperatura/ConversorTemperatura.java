package conversorTemperatura;

import java.util.Scanner;

public class ConversorTemperatura {
	public static void main(String[] args) {
		double temp, newTemp;
		String tipo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da temperatura: ");
		temp = Double.parseDouble(sc.nextLine());
		
		System.out.println("Digite o tipo atual da temperatura: ");
		tipo = sc.nextLine();
		
		if(tipo.equals("celsius")) {
			newTemp = (temp * 1.8) + 32;
			System.out.println(temp + " graus Celsius e = " + newTemp + " graus Fahrenheit");
		}
		else {
			newTemp = (temp - 32 ) / 1.8;
			System.out.println(temp + " graus Fahrenheit e = " + newTemp + " graus Celsius");
		}

	}
}
