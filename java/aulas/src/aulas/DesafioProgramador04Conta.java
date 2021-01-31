package aulas;

import java.util.Scanner;

public class DesafioProgramador04Conta 
{
	public static void main(String[] args) {
		/*	[1/2] - CONTA XXXXX
			SELECIONE O MOVIMENTO - D/C:
			VALOR: _
			DESCRIÇÃO:  
			SALDO ATUAL:_
			CONTINUA S/N:
			A CONTA NÃO PODE FICA NEGATIVA
			C EMPRESA - DESEJA FAZER UM EMPRESTIMO S/N: 
			SE SIM O LIMITE É  10.000 - SALDO
			*/

		Scanner ler= new Scanner (System.in); 
		double saldo=0, valorEmprestimo=0, valorEmprestimoI=10000;
		int movimento,continua=0, opEmprestimolDecidir;
		int qnt=1;
		double valor[]= new double[999];
		String descricao[] = new String [999];
		String cd[]= new String [999];
		String c="CREDITO";
		String d="DÉBITO";
		
		do
			{
			System.out.println("\t\t\t\t\tBEM VINDO A CONTA EMPRESARIAL\n");
			System.out.println("SELECIONE UM MOVIMENTO 1- debito/ 2-credito:");
			movimento=ler.nextInt();
				if(movimento==1) 
				{ 
					cd[qnt]=c;
					System.out.println("SALDO ATUAL: "+saldo);
					System.out.println("VALOR DA OPERAÇÃO: ");
					valor [qnt]= ler.nextDouble();
					System.out.println("DESCRIÇÃO DA OPERAÇÃO: ");
					descricao[qnt] = ler.next();
					
					if(saldo-valor[qnt]<0) 
					{
						System.out.println("Prezado cliente, seu saldo não é suficiente para essa operação");
						System.out.println("Deseja fazer um emprestimo? 1 - SIM/ 2 - NÃO ");
						opEmprestimolDecidir = ler.nextInt();
						
						if(opEmprestimolDecidir==1)
						{
							
							System.out.println("Digite valor do emprestimo: ");
							valorEmprestimo= ler.nextDouble();
							saldo=+valorEmprestimo;
							valorEmprestimoI=valorEmprestimoI-valorEmprestimo;
							System.out.println("NOVO SALDO: "+saldo);
							System.out.println("VALOR DISPONIVEL PARA EMPRESTIMO: "+valorEmprestimoI);
							System.out.println("Fazer nova transação? 1- sim/ 2- não");
							continua = ler.nextInt();
							if(continua==1)
							{
								qnt++;
							}
						}
						else if(opEmprestimolDecidir==2)
						{
							System.out.println("Fazer nova transação? 1- sim/ 2- não");
							continua = ler.nextInt();
							if(continua==1)
							{
								qnt++;
							}
							
						}
						else
						{
							System.out.println("Decisão não identificada.");
							System.out.println("Deseja fazer um emprestimo? 1 - SIM/ 2 - NÃO ");
							opEmprestimolDecidir = ler.nextInt();
							if(opEmprestimolDecidir==2)
							{
								qnt--;
								System.out.println("Fazer nova transação? 1- sim/ 2- não");
								continua = ler.nextInt();
								if(continua==1)
								{
									qnt++;
								}
							}
						}
					}
					else
					{
						saldo=saldo-valor[qnt];
						System.out.println("NOVO SALDO: "+saldo);
						System.out.println("Fazer nova transação? 1- sim/ 2- não");
						continua = ler.nextInt();
						if(continua==1)
						{
							qnt++;
						}
					}
					
					
				}
				else if (movimento==2)
				{
					cd[qnt]=d;
					System.out.println("SALDO ATUAL: "+saldo);
					System.out.println("VALOR DA OPERAÇÃO: ");
					valor[qnt] = ler.nextDouble();
					System.out.println("DESCRIÇÃO DA OPERAÇÃO: ");
					descricao[qnt] = ler.next();
					
					saldo=saldo+valor[qnt];
					
					System.out.println("NOVO SALDO: "+saldo);
					System.out.println("Fazer nova transação? 1- sim/ 2- não");
					continua = ler.nextInt();
					if(continua==1)
					{
						qnt++;
					}
				}
				else 
				{
					System.out.println("Operação não identificada.");
					System.out.println("SELECIONE UM MOVIMENTO 1- debito/ 2-credito:");
					movimento=ler.nextInt();
				}	
			}
		while(continua==1);
		System.out.println("====================================");
		System.out.println("OCORRERAM "+qnt+" MOVIMENTAÇÕES"
				+"\nVALOR DE EMPRESTIMO A PAGAR: "+(10000-valorEmprestimoI)+"\n");
		for(int x=0;x<qnt;x++)
		{
			System.out.println("TRANSAÇÃO - "+(x+1)+" :"+cd[x+1]+"\nVALOR: "+valor[x+1]+"\t DESCRIÇÃO: "+descricao[x+1]+"\n");
		}
		System.out.println("====================================");
		return;
	}
}
