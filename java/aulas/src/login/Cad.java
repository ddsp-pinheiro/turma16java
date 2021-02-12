package login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cad {
	
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		String usuario;
		String senha;
		String nome;
		String email;
		String cpf;
		char sexo;
		int anoDeNascimento;
		//int contador;
		
		char op;
		
		System.out.println("\t\t\t\tBEM VINDO\n");
		System.out.println("O que deseja?\nC-Cadastro\nL-Login");
		op= read.next().toUpperCase().charAt(0);
		
		List <Dados> list = new ArrayList<Dados>();
		
		do{
			if (op=='C')
			{	
				System.out.println("Informe seu usuario: ");
				usuario=read.next();
				System.out.println("Informe uma senha: ");
				senha=read.next();
				System.out.println("Informe seu nome: ");
				nome=read.next();
				System.out.println("Informe uma email: ");
				email=read.next();
				System.out.println("Informe seu cpf: ");
				cpf=read.next();
				System.out.println("Informe seu sexo (F-FEMININO, M-MASCULINO OU O-OUTRO): ");
				sexo=read.next().toUpperCase().charAt(0);
				try{
					System.out.println("Informe seu ano de nacimemnto: ");
					anoDeNascimento=read.nextInt();
				}
				catch(java.util.InputMismatchException erroFormatoInvalido)
				{
					System.out.println("Digite um numro no formato [aaaa], (Ex:2021): ");
					anoDeNascimento=read.nextInt();
				}
				System.out.println("Efetuar novo cadastro[C] ou fazer login[L]?");
				op = read.next().toUpperCase().charAt(0);
			}
			else if(op=='L')
			{
				System.out.println("Insira seu usuario: ");
				usuario=read.next();
				System.out.println("Insira seu senha: ");
				senha=read.next();
				
				Dados c = new Dados(usuario, senha);
				System.out.println("Efetuar novo cadastro[C] ou fazer login[L]?");
				op = read.next().toUpperCase().charAt(0);
			}
		}while(op=='C'||op=='L');
			
	}

	
}