package provaJava;

import java.time.LocalTime;

public class Checkpoint {
	private Trecho trecho;
	private LocalTime fimTrajeto;
	
	public Trecho getTrecho() {
		return trecho;
	}
	public void setTrecho(Trecho trecho) {
		this.trecho = trecho;
	}
	public LocalTime getFimTrajeto() {
		return fimTrajeto;
	}
	public void setFimTrajeto(LocalTime fimTrajeto) {
		this.fimTrajeto = fimTrajeto;
	}	
}
