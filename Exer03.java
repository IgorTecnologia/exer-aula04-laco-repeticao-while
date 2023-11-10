package com.igor.cursojava.aula04;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		int idade =0, totalMenor =0, totalMaior =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n**** Verificando idades ****");
		
		while(idade >=0) {
			System.out.println("\nDigite uma idade: ");
			idade = scan.nextInt();
			
			if(idade >=0 && idade<21) {
				totalMenor ++;
			}else if(idade >50) {
				totalMaior ++;
			}
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + totalMaior);
	}

}
