package br.com.pc2.semana3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaSaidaBuff {

	public static void main(String[] args) throws IOException{
		
		/*
		 * InputStreamReader ir = new InputStreamReader(System.in);
		 * 
		 * BufferedReader bf = new BufferedReader(ir);
		 */	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Digite a matrícula: ");
		int matricula = Integer.parseInt(bf.readLine());
		System.out.print("Digite o nome: ");
		String nome = bf.readLine();
		System.out.print("Digite o dia do nascimento: ");
		String dia = bf.readLine();
		System.out.print("Digite o mês do nascimento: ");
		String mes = bf.readLine();
		System.out.print("Digite o ano do nascimento: ");
		String ano = bf.readLine();
		
		DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		Aluno a = new Aluno();
		a.matricula = matricula;
		a.nome = nome;
		a.dataDeNascimento = dataDeNascimento;
		
		/*
		 * bf.close(); ir.close();
		 */
		
		bf.close();
		
		System.out.println(a);

	}

}
