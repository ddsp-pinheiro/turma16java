package cadastro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Criar 
{
	Scanner sc = new Scanner (System.in);
	String pastaNome;
	String mensagem;
	char op;
	
	public Criar() {
	    
		
		System.out.println("Digite o nome da pasta que deseja criar:"
				+ "\n(Observação: Não adicione "+".txt"+" ao nome)");
		pastaNome =sc.next();
		pastaNome=pastaNome+".txt";
		try {
	      File arquivo = new File(pastaNome);
	      if (arquivo.createNewFile()) {
	        System.out.println("Pasta criada: " + arquivo.getName());
	      } else if(arquivo.exists()){
	        System.out.println("A pasta já existe.");
	      }
		}catch (IOException erro) {
	      System.out.println("Ocorreu um erro.");
	      erro.printStackTrace();
	    }
	}
			
}
