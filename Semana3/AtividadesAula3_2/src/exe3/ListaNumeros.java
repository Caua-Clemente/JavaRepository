package exe3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
	private List<Float> lista = new ArrayList();
	
	public void novoNumero(float f) {
		lista.add(f);
	}
	
	public void listaNumeros() {
		for(int i = 0; i < this.lista.size(); i++)
			System.out.println(this.lista.get(i));
	}

	public float media() {
		float total = 0;
		for(int i = 0; i < this.lista.size(); i++) {
			total += this.lista.get(i);
		}
		return total/this.lista.size();
	}
	
	public void ordena() {
		boolean check = true;
		float aux;
		do {
			check = true;
			for(int i = 0; i < this.lista.size() - 1; i++) {
				if(this.lista.get(i) > this.lista.get(i + 1)) {
					check = false;
					aux = lista.get(i);
					this.lista.set(i, lista.get(i+1));
					this.lista.set(i+1, aux);
					i = this.lista.size();
				}
			}	
		} while(check == false);
	}
	
	public float mediana() {
		if(this.lista.size()%2 == 0)
			return (((lista.get(lista.size()/2)) + (lista.get(lista.size()/2) + 1)) / 2);
		else
			return (lista.get(lista.size()/2));
	}
	
	public float colocadoEm(int n) {
		return this.lista.get((this.lista.size() - n));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num;
		ListaNumeros lista = new ListaNumeros();
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i+1) + " numero: ");
			lista.novoNumero(sc.nextFloat());
		}
		
		lista.listaNumeros();
		System.out.println("Mediana: " + lista.mediana());
		System.out.println("Media: " + lista.media());
		
		lista.ordena();
		lista.listaNumeros();
		System.out.println("Mediana: " + lista.mediana());
		System.out.println("Media: " + lista.media());
		System.out.println("Quarto colocado da lista: " + lista.colocadoEm(4));
	}
}
