package com.ufc.service;

import java.util.Scanner;

public class ForcaSERVICE {

	public void Forca(String Palavra) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		char[] traco = new char[Palavra.length()];
		for (int i = 0; i < Palavra.length(); i++) {
			traco[i] = '_';
		}

		int PalavraString = Palavra.length();
		int tentativas = 6;

		while (PalavraString > 0 && tentativas > 0) {
			System.out.println();
			for (int i = 0; i < Palavra.length(); i++) {
				System.out.print(" " + traco[i] + " ");
			}
			System.out.println();

			System.out.println("Você tem " + tentativas + " chances de adivinhar");
			System.out.println("A palavra tem " + PalavraString + " letras restantes");
			System.out.println("Digite uma letra: ");

			// teclado.nextLine();
			char letras = teclado.next().charAt(0);
			boolean iscorrect = false;
			for (int i = 0; i < traco.length; i++) {

				if (Palavra.charAt(i) == letras || Palavra.charAt(i) == Character.toUpperCase(letras)) {
					traco[i] = letras;
					PalavraString--;
					iscorrect = true;
				}
			}

			if (!iscorrect) {
				tentativas--;
			}
		}

		if (PalavraString == 0) {
			System.out.println("\n" + Palavra);
			System.out.println("PARABENS! Você ACERTOU! :)");

		} else {
			System.out.println("Infelizmente Você Perdeu :(");
			System.out.println("A palavra era " + Palavra);
		}
	}

}
