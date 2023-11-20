package exe8;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Exe8_2 {
	public static void main(String[] args) {
		int dia, mes, ano, hdia, hmes, hano;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a data de seu nascimento: ");
		System.out.println("Dia: ");
		dia = sc.nextInt();
		System.out.println("Mes: ");
		mes = sc.nextInt();
		System.out.println("Ano: ");
		ano = sc.nextInt();
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(ano, mes, dia, 0, 0, 0);
		Date data1 = calendar1.getTime();

		
		System.out.println("Digite a data atual: ");
		System.out.println("Dia: ");
		hdia = sc.nextInt();
		System.out.println("Mes: ");
		hmes = sc.nextInt();
		System.out.println("Ano: ");
		hano = sc.nextInt();	
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(hano, hmes, hdia, 0, 0, 0);
		Date data2 = calendar2.getTime();
		
		if(hano - ano >= 18)
			System.out.println("Voce e maior de idade");
		else		
			System.out.println("Voce e menor de idade");
	}
}
