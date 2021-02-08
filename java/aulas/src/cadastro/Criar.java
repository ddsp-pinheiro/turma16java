package cadastro;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Criar 
{
	String pastaNome;
	public Criar() {
	    
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome da pasta:");
		pastaNome =sc.next();
		pastaNome=pastaNome+".txt";
		
		try {
	      File obj = new File(pastaNome);
	      if (obj.createNewFile()) {
	        System.out.println("Pasta criada: " + obj.getName());
	      } else {
	        System.out.println("A pasta já existe.");
	      }
	    } catch (IOException erro) {
	      System.out.println("Ocorreu um erro.");
	      erro.printStackTrace();
	    }
	  }
	
	
}
