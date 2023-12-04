package provaJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Trajeto {
	private String codigo;
	private List<Trecho> trechos = new ArrayList<Trecho>();
	private LocalDate inicioTrajeto;
	private Checkpoint checkpoint;
	
	public LocalDate getInicioTrajeto() {
		return inicioTrajeto;
	}
	public void setInicioTrajeto(LocalDate inicioTrajeto) {
		this.inicioTrajeto = inicioTrajeto;
	}
	public String getCodigo() {
		return codigo;
	}
	public List<Trecho> getTrechos() {
		return trechos;
	}
	public Checkpoint getCheckpoint() {
		return checkpoint;
	}	
}
