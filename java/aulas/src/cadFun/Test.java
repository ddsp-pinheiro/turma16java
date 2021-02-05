package cadFun;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		List<Empregado> list = new ArrayList<>();

		System.out.print("Numero de empregados: ");
		int n = read.nextInt();

		for (int i=1; i<=n; i++) {
			System.out.println("Empregado numero: " + i +"\n=========================================================");
			System.out.print("Terceiro (s/n)? ");
			char op = read.next().charAt(0);
			System.out.print("Matricula: ");
			read.nextLine();
			int matricula = read.nextInt();
			System.out.print("Nome: ");
			read.nextLine();
			String nome = read.nextLine();
			System.out.print("Horas: ");
			int hora = read.nextInt();
			System.out.print("Valor por hora: ");
			double valorHora = read.nextDouble();
			if (op == 's') {
				System.out.print("Acrescimo: ");
				double acrescimo = read.nextDouble();
				Empregado e1= new Terceiro(nome, matricula , hora, valorHora, acrescimo);
			}
			else if (op =='N')
			{
				Empregado e1 =new Empregado(nome, matricula , hora, valorHora);
			}
		}

		
		System.out.println("Pagamento:");
		for (Empregado emp : list) {
			System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.salario()));
		}
	}
}
