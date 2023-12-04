package provaJava;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
    private List<Motorista> listaMotorista = new ArrayList<Motorista>();
    private List<Cobrador> listaCobrador = new ArrayList<Cobrador>();
    private List<Passageiro> listaPassageiro = new ArrayList<Passageiro>();

    
    private List<Ponto> listaPonto = new ArrayList<Ponto>();
    private List<Trajeto> listaTrajetos = new ArrayList<Trajeto>();
    private List<Jornada> listaJornada = new ArrayList<Jornada>();


    public void CadastroVeiculo(){
    /*
        Pede uma (string placa) e um (int anoCompra).
        Ao passar a placa, ele verifica em sua lista de veiculos se já existe algum veiculo com essa placa.
        Se já houver, ele retorna a função sem cadastrar o veiculo, retornando uma mensagem (syso) de erro no console
        Se todas as entradas estiverem corretas, cria uma nova instancia de veiculo e coloca em "listaVeiculo"
    */
    }

    public void CadastroMotorista(){
    /*
        Pede um (string nome), um (string CPF), e um (string CNH). 
        Faz o mesmo processo de verificação do cadastro do veículo, dessa vez com CNH e CPF.
        Se tudo estiver correto, cria um novo Motorista para "listaMotorista"
    */
    }

    public void CadastroCobrador(){
    /*
        Pede um (string nome) e um (string CPF). 
        Verifica se já existe cobrador com este cpf.
        Se tudo estiver correto, cria um novo Cobrador para "listaCobrador"
    */
    }

    public void CadastroPassageiro(){
    /*
        Pede um (string nome), um (string CPF), um (string numCartao) e um (string tipoCartao)
        Verifica se já existe este CPF ou numCartao em listaPassageiros.
        Se tudo estiver correto, cria um novo Passageiro para "listaPassageiro"
        A lista de embarques do passageiro é criada vazia
    */
    }

    public void CadastroPonto(){
    /*
        Pede um (string nomePonto)
        Verifica se já existe esse nome em "listaPonto"
        Se tudo estiver correto, cria um novo Ponto em "listaPonto"
    */
    }    

    public void CadastroTrajeto(){
    /*
        Pede strings nomePonto, um por um, para armazenar em uma lista local de Ponto, com minimo de dois pontos até a quantidade que o usuario desejar.
        Se algum ponto inserido nao existir, ele retorna uma mensagem e volta para o menu
        A partir da lista local de pontos, pede o tempo de intervalo entre um ponto e outro (criando os trechos) e anexa os trechos na lista de trechos do trajeto
        Pede um numero para especificar qual trecho é o checkpoint do trajeto
        O "fimTrajeto" de Checkpoint e "inicioTrajeto" são passados como datas vazias 

        Cria um novo codigo aleatorio para funcionar como um id
        Se tudo estiver correto, cria um novo trajeto para "listaTrajetos"
    */
    }    

    public void CadastroJornada(){
    /*
        Pede um CPF de um motorista, placa de um veículo e (opcionalmente) pede um CPF de um cobrador. Verifica se cada um deles existe
        Pede um único trajeto a partir do código e verifica se existe
        Pede o numero "n" de vezes que o trajeto será executado na jornada
        Cria uma lista "trajetos" de tamanho "n"
        o int "trajetoAtual" é passado como 0

        Cria um novo codigo aleatorio para funcionar como um id
        Se tudo estiver correto, cria uma nova jornada para "listaJornada"
    */
    }

    public void RegistroInicioJornada(){
    /*
        Pede uma jornada e registra o horario atual para o inicioTrajeto do tragetoAtual.
    */
    }

    public void RegistroEmbarquePassageiro(){
    /*
        Pede um string numCartao e o ponto de embarque.
        cria uma variavel local com a data e hora de embarque

        Se tudo estiver correto, anexa um ponto de embarque e hora de embarque em suas respectivas listas no determinado passageiro
    */
    }

    public void RegistrarCheckpoint(){
    /*
        Pede uma jornada e registra o horario atual para o fimTrajeto do checkpoint do tragetoAtual.
        Soma +1 em trajetoAtual para pular para o próximo trajeto
    */
    }
}