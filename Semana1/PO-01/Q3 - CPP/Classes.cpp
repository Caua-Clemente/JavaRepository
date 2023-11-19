#include <iostream>
using namespace std;

class Aluno {
    private:
        string nome, matricula;

    public:
        string getNome() {
            return this->nome;
        }

        void setNome(string nome){
            this->nome = nome;
        }

        string getMatricula() {
            return this->matricula;
        }

        void setMatricula(string matricula){
            this->matricula = matricula;
        }

        void estudar(){
            cout << "Estou estudando" << endl;
        }
};

class AlunoIC : public Aluno {
	private:
		string Projeto;
	public:
		string getProjeto() {
			return Projeto;
		}

		void setProjeto(string projeto) {
			Projeto = projeto;
		}
		
		void estudandoProjeto() {
			cout << "Estudando o projeto " << this->getProjeto() << endl;
		}
};

class Bomba {
	private: 
        float potencia = 0;
	    int bombTimer = 0;

	public:
    
		float getPotencia(){
			return this->potencia;
		}

		void setPotencia(float potencia){
			this->potencia = potencia;
		}

		int getBombTimer(){
			return this->bombTimer;
		}

		void setBombTimer(int bombTimer){
			this->bombTimer = bombTimer;
		}

		void explodir(){
			cout << "'Explosao'" << endl;
		}
};

class BombaGigante : public Bomba {
	public:
		void explodir() {
			cout << "'Explosao gigante'" << endl;
		}
};

class Cachorro {
	private:
        string nome, raca;
	
    public:
	string getNome() {
		return nome;
	}

	void setNome(string nome) {
		this->nome = nome;
	}

	string getRaca() {
		return raca;
	}

	void setRaca(string raca) {
		this->raca = raca;
	}

	void latir() {
		cout << "Au" << endl;
	}
};

class CachorroTreinado : public Cachorro {
	public:
		void darPata() {
			cout << "'Dando a pata'" << endl;
		}
};

class Pessoa {
	private:
        string nome, cpf;
	    int idade;
	
    public:
		string getNome() {
			return nome;
		}
		void setNome(string nome) {
			this->nome = nome;
		}
		string getCpf() {
			return cpf;
		}
		void setCpf(string cpf) {
			this->cpf = cpf;
		}
		int getIdade() {
			return idade;
		}
		void setIdade(int idade) {
			this->idade = idade;
		}	
};

class Funcionario : public Pessoa{
	private:
		float salario;
	public:
		float getSalario() {
			return salario;
		}

		void setSalario(float salario) {
			this->salario = salario;
		}
};

class Produto {
	private:
        float preco = 0;
	    int qtde = 0;
	    string nome;
	
    public:
		float getPreco() {
			return preco;
		}
		void setPreco(float preco) {
			this->preco = preco;
		}
		int getQtde() {
			return qtde;
		}
		void setQtde(int qtde) {
			this->qtde = qtde;
		}
		string getNome() {
			return nome;
		}
		void setNome(string nome) {
			this->nome = nome;
		}	
};

class Celular : public Produto {
	private:
		string marca, modelo;
		int gbMemoriaRAM, gbMemoriaROM;
	
	public:
		string getMarca() {
			return marca;
		}

		void setMarca(string marca) {
			this->marca = marca;
		}

		string getModelo() {
			return modelo;
		}

		void setModelo(string modelo) {
			this->modelo = modelo;
		}

		int getGbMemoriaRAM() {
			return gbMemoriaRAM;
		}

		void setGbMemoriaRAM(int gbMemoriaRAM) {
			this->gbMemoriaRAM = gbMemoriaRAM;
		}

		int getGbMemoriaROM() {
			return gbMemoriaROM;
		}

		void setGbMemoriaROM(int gbMemoriaROM) {
			this->gbMemoriaROM = gbMemoriaROM;
		}
};
