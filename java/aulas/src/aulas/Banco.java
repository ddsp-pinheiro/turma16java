	package aulas;

	import java.util.Scanner;

	public class Banco 
	{
		
		public static void contaEmpresa() {
			/*[1 / 2 ] - CONTA XXXXX
				SELECIONE O MOVIMENTO - D/C:
				VALOR: _
				DESCRI��O:  
				SALDO ATUAL:_
				CONTINUA S/N:
				A CONTA N�O PODE FICA NEGATIVA
				C EMPRESA - DESEJA FAZER UM EMPRESTIMO S/N: 
				SE SIM O LIMITE �  10.000 - SALDO
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
						System.out.println("VALOR DA OPERA��O: ");
						valor = ler.nextDouble();
						System.out.println("DESCRI��O DA OPERA��O: ");
						descricao = ler.next();
						if(saldo<0) 
						{
							System.out.println("Prezado cliente, seu saldo n�o � suficiente para essa opera��o");
							System.out.println("Deseja fazer um emprestimo? 1 - SIM/ 2 - N�O ");
							opEmprestimolDecidir = ler.nextInt();
							
							if(opEmprestimolDecidir==1)
							{
								System.out.println("Digite valor do emprestimo: ");
								valorEmprestimo= ler.nextDouble();
								saldo=+valorEmprestimo;
								valorEmprestimoI=valorEmprestimoI-valorEmprestimo;
								System.out.println("NOVO SALDO: "+saldo);
								System.out.println("VALOR DISPONIVEL PARA EMPRESTIMO: "+valorEmprestimoI);
								System.out.println("Fazer nova transa��o? 1- sim/ 2- n�o");
								continua = ler.nextInt();
							}
							else if(opEmprestimolDecidir==2)
							{
								System.out.println("Fazer nova transa��o? 1- sim/ 2- n�o");
								continua = ler.nextInt();
							}
							else
							{
								System.out.println("Decis�o n�o identificada.");
								System.out.println("Deseja fazer um emprestimo? 1 - SIM/ 2 - N�O ");
								opEmprestimolDecidir = ler.nextInt();
								if(opEmprestimolDecidir==2)
								{
									System.out.println("Fazer nova transa��o? 1- sim/ 2- n�o");
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
						System.out.println("VALOR DA OPERA��O: ");
						valor = ler.nextDouble();
						System.out.println("DESCRI��O DA OPERA��O: ");
						descricao = ler.next();
						
						saldo=saldo+valor;
						
						System.out.println("NOVO SALDO: "+saldo);
						System.out.println("Fazer nova transa��o? 1- sim/ 2- n�o");
						continua = ler.nextInt();
					}
					else 
					{
						System.out.println("Opera��o n�o identificada.");
					}
				}
			while(continua==1);
			return;
		}

	}

