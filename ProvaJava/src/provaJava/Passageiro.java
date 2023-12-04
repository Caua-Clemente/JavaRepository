package provaJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Passageiro {
	private String nome;
	private String CPF;
	private String numCartao;
	private String tipoCartao;
	private List<Ponto> pontoEmbarques = new ArrayList<Ponto>();
	private List<LocalDate> horaEmbarque = new ArrayList<LocalDate>();
	
	public List<Ponto> getPontoEmbarques() {
		return pontoEmbarques;
	}
	public void setPontoEmbarques(List<Ponto> pontoEmbarques) {
		this.pontoEmbarques = pontoEmbarques;
	}
	public List<LocalDate> getHoraEmbarque() {
		return horaEmbarque;
	}
	public void setHoraEmbarque(List<LocalDate> horaEmbarque) {
		this.horaEmbarque = horaEmbarque;
	}
	public String getNome() {
		return nome;
	}
	public String getCPF() {
		return CPF;
	}
	public String getNumCartao() {
		return numCartao;
	}
	public String getTipoCartao() {
		return tipoCartao;
	}
	
	
}
