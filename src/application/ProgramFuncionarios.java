package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;
import entities.Terceirizados;

public class ProgramFuncionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("Entre com o número de funcionários: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nDados do Funcinário #" + i);
			System.out.print("É terceirizado (y/n) ? ");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double vlrPorHora = sc.nextDouble();	
			
			if (c == 'y') {
				System.out.print("Valor adicional: ");
				double vlrAdicional = sc.nextDouble();
				
				Funcionarios f = new Terceirizados(nome, horas, vlrPorHora, vlrAdicional);
				
				list.add(f);
			} else {
				Funcionarios f = new Funcionarios(nome, horas, vlrPorHora);
				
				list.add(f);
			}
			
		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		//para cada funcionário da f da minha lista
		for (Funcionarios f : list) {
			System.out.println(f.getNome() + " - $" + String.format("%.2f", f.pagamento()));
			
		}
		
		
		sc.close();

	}

}
