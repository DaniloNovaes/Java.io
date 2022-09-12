package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//SCANNER PARA LER LINHA POR LINHA
		Scanner scanner = new Scanner(new File("contas.csv"));
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			
			Scanner linhaScanner = new Scanner(linha); //STRING SOURCE
			linhaScanner.useLocale(Locale.US); //PARA FAZER FUNCIONAR o Double com . "210.1"
			//Antes não funcionava porque meu windows é em PT-BR, dessa forma, o Java esperava "210,1" etc.
			
			linhaScanner.useDelimiter(","); //Para pegar as informações separadas pela vírgula
			
			String valor1 = linhaScanner.next(); //Vai pegando cada valor separado por vírgula.
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			Double valor5 = linhaScanner.nextDouble();
	
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			linhaScanner.close();
			//String [] valores = linha.split(",");
			//System.out.println(valores[3]);
		}
		scanner.close();
	}

}
