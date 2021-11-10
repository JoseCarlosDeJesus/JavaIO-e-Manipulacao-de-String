package br.com.pc2.semana3;

public class Aluno {
	Integer matricula;
	String nome;
	DataPadraoBrasil dataDeNascimento;

	@Override
	public String toString() {
		return "Aluno [Matrícula=" + matricula + ", Nome=" + nome + ", Data de Nascimento=" + dataDeNascimento + "]";
	}

}
