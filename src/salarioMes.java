import java.util.Scanner;

public class salarioMes {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
		 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
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
