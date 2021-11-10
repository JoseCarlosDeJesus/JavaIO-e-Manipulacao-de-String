package br.com.pc2.semana3;

import javax.swing.JOptionPane;

public class EntradaSaidaJOPtionPane {

	public static void main(String[] args) {
		
		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula"));
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String dia = JOptionPane.showInputDialog("Digite o dia do nascimento");
		String mes = JOptionPane.showInputDialog("Digite o mês do nascimento");
		String ano = JOptionPane.showInputDialog("Digite o ano do nascimento");
		
		DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		Aluno a = new Aluno();
		a.matricula = matricula;
		a.nome = nome;
		a.dataDeNascimento = dataDeNascimento;
		//System.out.println(a);
		
		JOptionPane.showMessageDialog(null, a);

	}

}
