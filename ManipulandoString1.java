package br.com.pc2.semana3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ManipulandoString1 {

	public static void main(String[] args) {
		/*
		 * String s1 = new String("A"); String s2 = new String("a");
		 * 
		 * if(s1.equalsIgnoreCase(s2)) { System.out.println("São iguais"); }else {
		 * System.out.println("São diferentes"); }
		 */

		/*
		 * String s = "Programação de computadores II";
		 * 
		 * System.out.println(s.length());
		 * 
		 * String s1 = s.substring(5);
		 * 
		 * System.out.println(s1);
		 * 
		 * String s2 = s.substring(5,11);
		 * 
		 * System.out.println(s2);
		 * 
		 * char c = s.charAt(6); System.out.println(c);
		 * 
		 * String s3 = new String("A"); String s4 = new String("A"); int res =
		 * s3.compareTo(s4); System.out.println(res);
		 * 
		 * String s5 = s.replace("r", "l");
		 * 
		 * System.out.println(s5);
		 */
		
		
		/*
		 * String comEspaco = " Hoje é quinta-feira "; System.out.println(comEspaco);
		 * System.out.println(comEspaco.length());
		 * 
		 * String semEspaco = comEspaco.trim();
		 * 
		 * System.out.println(semEspaco); System.out.println(semEspaco.length());
		 */
		
		
		/*
		 * String s = "Nome,Endereço,UF,CEP"; String[] cabecalho = s.split(",");
		 * System.out.println(cabecalho[0]);//Exibe Nome
		 * System.out.println(cabecalho[1]);//Exibe Endereço
		 * System.out.println(cabecalho[2]);//Exibe UF
		 * System.out.println(cabecalho[3]);//Exibe CEP
		 */		
		
		/*
		 * NumberFormat nf = NumberFormat.getCurrencyInstance(); double n = 4.349898989;
		 * System.out.println(nf.format(n));
		 * 
		 * DecimalFormat nf1 = new DecimalFormat("000000.##"); double n1 = 46.349898989;
		 * System.out.println(nf1.format(n1));
		 */
		
		
		
		/*
		 * Date dataHoje = new Date(); System.out.println(dataHoje);
		 */
		
		Date dataHoje = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");//use MM e não mm
		System.out.println(sf.format(dataHoje));
		

	}

}
