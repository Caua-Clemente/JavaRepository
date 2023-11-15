package aluno;

public class Aluno {
	private String nome, matricula;

	public String getNome() {
        return this.nome;
    }

	public void setNome(String nome){
        this.nome = nome;
    }

	public String getMatricula() {
        return this.matricula;
    }

	public void setMatricula(String matricula){
        this.matricula = matricula;
    }

	public void estudar(){
        System.out.println("Estou estudando");
        }
}

