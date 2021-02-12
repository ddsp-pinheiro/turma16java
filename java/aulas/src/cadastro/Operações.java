package cadastro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Operações {
	Scanner sc = new Scanner (System.in);
	String pastaNome;
	String mensagem;
	char op;
	
	public void Criar() {
	    
		
		System.out.println("Digite o nome da pasta que deseja criar:"
				+ "\n(Observação: Não adicione "+".txt"+" ao nome)");
		pastaNome =sc.next();
		pastaNome=pastaNome+".txt";
		try {
	      File obj = new File(pastaNome);
	      if (obj.createNewFile()) {
	        System.out.println("Pasta criada: " + obj.getName());
	      } else {
	        System.out.println("A pasta já existe.");
	      }
		}catch (IOException erro) {
	      System.out.println("Ocorreu um erro.");
	      erro.printStackTrace();
	    }
	}
	
	public void Escrever() {
			
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
		      System.out.println("Ocorreu um erro.");
		      erro.printStackTrace();
		    }
		}
	
	public void Ler() {
		try {
			System.out.println("Digite o nome da pasta que deseja ler: \n(Observação: Não adicione "+".txt"+" ao nome)");
			pastaNome = sc.next();
			pastaNome=pastaNome+".txt";
			
		      File mensagem = new File(pastaNome);
		      Scanner leitorDeArquvo = new Scanner(mensagem);
		      while (leitorDeArquvo.hasNextLine()) {
		        String data = leitorDeArquvo.nextLine();
		        System.out.println(data);
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("Ocorreu um erro.");
		      e.printStackTrace();
		    }
	}


}
