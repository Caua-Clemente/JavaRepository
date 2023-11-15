package aluno;

public class AlunoIC extends Aluno {
	private String Projeto;

	public String getProjeto() {
		return Projeto;
	}

	public void setProjeto(String projeto) {
		Projeto = projeto;
	}
	
	public void estudandoProjeto() {
		System.out.println("Estudando o projeto " + this.getProjeto());
	}
}
