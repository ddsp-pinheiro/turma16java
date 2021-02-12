package cadastro;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrever {
	Scanner sc = new Scanner (System.in);
	String pastaNome;
	String mensagem;
	char op;
	public Escrever() {
		
		System.out.println("Digite o nome da pasta onde deseja escrever:"
				+ " \n(Observação: Não adicione "+".txt"+" ao nome)");
		pastaNome = sc.next();
		pastaNome=pastaNome+".txt";

		try 
		{
			
			FileWriter escrever = new FileWriter(pastaNome, true);
			do {
				System.out.println("Digite algo:");
				mensagem=sc.next();
				escrever.append(mensagem);
				System.out.println("Atribuir mais uma mensagem? [S/N]");
				op = sc.next().toUpperCase().charAt(0);
			}while(op=='S');
			escrever.close();
	      System.out.println("Mensagem atribuida.");
	    } catch (IOException erro) 
		{
	      System.out.println("Ocorreu um erro, não foi possivel realizar ação.");
	      erro.printStackTrace();
	    }
	}


}
