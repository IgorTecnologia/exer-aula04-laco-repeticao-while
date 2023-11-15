package com.igor.cursojava.aula04;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
	
		int idade, genero, desenvolvedor;
		String continuar = "S";
		int contadorBackend = 0;
		int contator;
		int contadorMulheresFrot = 0;
		int contadorHomensMobile = 0;
		int contadorBinariosFullStack = 0;
		int totalPessoas = 0;
		int somaIdade = 0;
		
		Scanner scan = new Scanner(System.in);
			
			
			while(continuar.equalsIgnoreCase("S")) {
				System.out.println("\n*********************************");
				System.out.println("\nPesquisa interna de colaboradores:");
				
				System.out.println("\nDigite sua idade: ");
				idade = scan.nextInt();
				
				System.out.println("\n************************");
				System.out.println("\nIdentidade de Gênero: ");
				System.out.println("\n1- Mulher Cis");
				System.out.println("\n2- Homem Cis");
				System.out.println("\n3- Não Binário");
				System.out.println("\n4- Mulher Trans");
				System.out.println("\n5- Homem Trans");
				System.out.println("\n6- Outros");
				genero = scan.nextInt();
				
				System.out.println("Pessoa Desenvolvedora: ");
				System.out.println("\n1- Backend");
				System.out.println("\n2- Frontend");
				System.out.println("\n3- Mobile");
				System.out.println("\n4- FullStack");
				desenvolvedor = scan.nextInt();
				
				if(desenvolvedor == 1) {
					contadorBackend ++;
				}else if(desenvolvedor == 2 && genero == 1 || genero == 4) {
					contadorMulheresFrot ++;
				}else if(desenvolvedor == 3 && genero == 2 || genero == 5 && idade >40) {
					contadorHomensMobile ++;
				}else if(desenvolvedor == 4 && genero == 3 && idade <30) {
					contadorBinariosFullStack ++;
				}
				totalPessoas ++;
				somaIdade += idade;
				
				System.out.println("Deseja continuar (S/N) ?");
				continuar = scan.next();
				}
			double mediaIdade = (double) somaIdade / totalPessoas;
			System.out.println("O número de pessoas desenvolvedoras Backend: " + contadorBackend);
			System.out.println("O número de mulheres Cis e Trans desenvolvedoras Frontend : " + contadorMulheresFrot);
			System.out.println("O número de  homens Cis e Trans desenvolvedores Mibile maior de 40 anos: " + contadorHomensMobile);
			System.out.println("O número de não Binários desenvolvedores FullStack menores de 30 anos: " + contadorBinariosFullStack);
			System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
			System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);
	}
				
			}
	



