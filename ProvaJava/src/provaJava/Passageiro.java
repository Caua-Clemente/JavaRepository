package provaJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Passageiro {
	String nome;
    String CPF;
    String numCartao;
    String tipoCartao;
    List<Ponto> pontoEmbarques = new ArrayList<Ponto>();
    List<LocalDate> horaEmbarque = new ArrayList<LocalDate>();
}
