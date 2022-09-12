package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		
		//Fluxo de Entrada com Arquivo
		
		InputStream fis = new FileInputStream("lorem.txt"); //CRIANDO O FLUXO BINÁRIO
		Reader isr = new InputStreamReader(fis); // TRANSFORMANDO OS BYTES EM CARACTERES
		BufferedReader br = new BufferedReader(isr);//READLINE, JUNTANDO OS CARACTERES
		//Possibilitando a leitura de uma linha inteira
		
		String linha = br.readLine(); //A classe Reader não tem o método readLine, por isso deixa o
		//BufferedReader ali em cima.
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
			
		}
		

		
		br.close(); //Para fechar o BufferedReader
		

	}

}
