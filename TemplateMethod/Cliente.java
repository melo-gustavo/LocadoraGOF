package TemplateMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		Filme filmeLoc = new Filme();
		Scanner sc = new Scanner(System.in);
		List<String> listFilme = new ArrayList<String>();
		String nome;
		int seletor;
		
		System.out.print("Digite o c�digo de g�nero: ");
		seletor = sc.nextInt();
		
		while(seletor != 0) {		
			if(seletor == 1) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeAcao clienteAcao = filmeLoc.filmeAcao(nome);
				listFilme.add(nome);
				System.out.println(clienteAcao);
				System.out.print("Digite o c�digo de g�nero");
				seletor = sc.nextInt();
			} else if(seletor == 2) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeComedia clienteComedia = filmeLoc.filmeComedia(nome);
				listFilme.add(nome);
				System.out.println(clienteComedia);
				System.out.print("Digite o c�digo de g�nero");
				seletor = sc.nextInt();
			} else if(seletor == 3) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeDocumentario clienteDocumentario = filmeLoc.filmeDocumentario(nome);
				listFilme.add(nome);
				System.out.println(clienteDocumentario);
				System.out.print("Digite o c�digo de g�nero");
				seletor = sc.nextInt();
			} else if(seletor == 4) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeFiccaoCientifica clienteFiccao = filmeLoc.filmeFiccaoCientifica(nome);
				listFilme.add(nome);
				System.out.println(clienteFiccao);
				System.out.print("Digite o c�digo de g�nero");
				seletor = sc.nextInt();
			} else if(seletor == 5) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeRomance clienteRomance = filmeLoc.filmeRomance(nome);
				listFilme.add(nome);
				System.out.println(clienteRomance);
				System.out.print("Digite o c�digo de g�nero");
				seletor = sc.nextInt();
			} else if(seletor == 6) {
				System.out.print("Digite o nome do filme: ");
				nome = sc.next();
				FilmeTerror clienteTerror = filmeLoc.filmeTerror(nome);
				listFilme.add(nome);
				System.out.println(clienteTerror);
				System.out.print("Digite o c�digo de g�nero");
				seletor = sc.nextInt();
			}
		}
		
		sc.close();
		
		System.out.println();
		System.out.println("Filme(s) alugado(s): ");
		
		for(String filme : listFilme) {
			System.out.println(filme);
		}
		
		System.out.println();
		System.out.println("Sess�o finalizada, obrigado por confiar em nosso servi�o!");
		
	}

}
