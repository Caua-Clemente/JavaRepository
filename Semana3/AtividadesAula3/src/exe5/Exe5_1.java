package exe5;

import java.util.Scanner;

public class Exe5_1 {
	public static double fahrParaCelsius(double temp) {
		return (temp - 32) / 1.8;
	}
	
	public static double celsiusParaFahr(double temp) {
		return (temp * 1.8) + 32;
	}
	
	public static void main(String[] args) {
		double temp1;
		String tipo1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura: ");
		temp1 = Double.parseDouble((sc.nextLine()));
		System.out.println("Ela e celsius ou fahrenheit? ");
		tipo1 = sc.nextLine();
		tipo1 = tipo1.toLowerCase();
		
		if(tipo1.equals("celsius"))
			System.out.println(temp1 + " celsius e = " + celsiusParaFahr(temp1) + " fahrenheit");
		else
			System.out.println(temp1 + " fahrenheit e = " + fahrParaCelsius(temp1) + " celsius");
			
		
	}
}
