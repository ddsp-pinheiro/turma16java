	package aulas;

	import java.util.Scanner;

	public class Banco 
	{
		
		public static void contaEmpresa() {
			/*[1 / 2 ] - CONTA XXXXX
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
			double saldo=0, valor=0,valorEmprestimo=0, valorEmprestimoI=10000;
			int movimento,continua=0, opEmprestimolDecidir;
			String descricao;
			
			
			
			do
				{
				System.out.println("\t\t\t\t\tBEM VINDO A CONTA EMPRESARIAL\n");
				System.out.println("SELECIONE UM MOVIMENTO 1- debito/ 2-credito:");
				movimento=ler.nextInt();
					if(movimento==1) 
					{
						System.out.println("SALDO ATUAL: "+saldo);
						System.out.println("VALOR DA OPERAÇÃO: ");
						valor = ler.nextDouble();
						System.out.println("DESCRIÇÃO DA OPERAÇÃO: ");
						descricao = ler.next();
						if(saldo<0) 
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
							}
							else if(opEmprestimolDecidir==2)
							{
								System.out.println("Fazer nova transação? 1- sim/ 2- não");
								continua = ler.nextInt();
							}
							else
							{
								System.out.println("Decisão não identificada.");
								System.out.println("Deseja fazer um emprestimo? 1 - SIM/ 2 - NÃO ");
								opEmprestimolDecidir = ler.nextInt();
								if(opEmprestimolDecidir==2)
								{
									System.out.println("Fazer nova transação? 1- sim/ 2- não");
									continua = ler.nextInt();
								}
							}
						}
						else
						{
							System.out.println("NOVO SALDO: "+saldo);
						}
						
						
					}
					else if (movimento==2)
					{
						System.out.println("SALDO ATUAL: "+saldo);
						System.out.println("VALOR DA OPERAÇÃO: ");
						valor = ler.nextDouble();
						System.out.println("DESCRIÇÃO DA OPERAÇÃO: ");
						descricao = ler.next();
						
						saldo=saldo+valor;
						
						System.out.println("NOVO SALDO: "+saldo);
						System.out.println("Fazer nova transação? 1- sim/ 2- não");
						continua = ler.nextInt();
					}
					else 
					{
						System.out.println("Operação não identificada.");
					}
				}
			while(continua==1);
			return;
		}

	}

