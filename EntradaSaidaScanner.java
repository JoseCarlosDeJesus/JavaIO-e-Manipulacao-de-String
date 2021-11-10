package br.com.pc2.semana3;

import java.util.Scanner;

public class EntradaSaidaScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Abrir o stream
		
		System.out.print("Digite a matrícula: ");
		int matricula = sc.nextInt();
		System.out.print("Digite o nome: ");
		String nome = sc.next();
		System.out.print("Digite o dia do nascimento: ");
		String dia = sc.next();
		System.out.print("Digite o mês do nascimento: ");
		String mes = sc.next();
		System.out.print("Digite o ano do nascimento: ");
		String ano = sc.next();
		sc.close();//Fechar o stream
		
		DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		Aluno a = new Aluno();
		a.matricula = matricula;
		a.nome = nome;
		a.dataDeNascimento = dataDeNascimento;
		
		System.out.println(a);

	}

}
