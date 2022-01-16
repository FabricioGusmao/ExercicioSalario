import java.util.Scanner;

public class salarioMes {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais
		 */

		Scanner sc = new Scanner (System.in);
		
		
		double valorH, salario;
		int IdFunc, horaM;
		
		System.out.println("Digite o ID do colaborador");
		IdFunc = sc.nextInt();
		System.out.println("Informe o numero de horas trabalhadas");
		horaM = sc.nextInt();
		System.out.println("Informe o valor por hora");
		valorH = sc.nextDouble();
		
		salario = valorH * horaM;
		
		System.out.println("Colaborador ID "+ IdFunc);
		System.out.printf("Salario R$ = %.2f%n", salario);
		
		
		
		sc.close();
		

	}

}
