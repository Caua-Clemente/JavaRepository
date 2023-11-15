package produto;

public class Celular extends Produto {
	private String marca, modelo;
	private int gbMemoriaRAM, gbMemoriaROM;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getGbMemoriaRAM() {
		return gbMemoriaRAM;
	}
	public void setGbMemoriaRAM(int gbMemoriaRAM) {
		this.gbMemoriaRAM = gbMemoriaRAM;
	}
	public int getGbMemoriaROM() {
		return gbMemoriaROM;
	}
	public void setGbMemoriaROM(int gbMemoriaROM) {
		this.gbMemoriaROM = gbMemoriaROM;
	}
	
	
}
