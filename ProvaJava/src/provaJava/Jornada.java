package provaJava;

import java.util.ArrayList;
import java.util.List;

public class Jornada {
	private String codigo;
	private List<Trajeto> trajetos = new ArrayList<Trajeto>();
	private Motorista motorista;
	private Veiculo veiculo;
	private Cobrador cobrador;
	private int trajetoAtual;
	
	public int getTrajetoAtual() {
		return trajetoAtual;
	}
	public void setTrajetoAtual(int trajetoAtual) {
		this.trajetoAtual = trajetoAtual;
	}
	public String getCodigo() {
		return codigo;
	}
	public List<Trajeto> getTrajetos() {
		return trajetos;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public Cobrador getCobrador() {
		return cobrador;
	}	
}
