package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		
		//Fluxo de Entrada com Arquivo
		
		InputStream fis = System.in; //new FileInputStream("lorem.txt"); //CRIANDO O FLUXO BINÁRIO
		Reader isr = new InputStreamReader(fis); // TRANSFORMANDO OS BYTES EM CARACTERES
		BufferedReader br = new BufferedReader(isr);//READLINE, JUNTANDO OS CARACTERES
		//Possibilitando a leitura de uma linha inteira
		
		
		OutputStream fos = System.out; //new FileOutputStream("lorem2.txt"); 
		Writer osw = new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine(); //A classe Reader não tem o método readLine, por isso deixa o
		//BufferedReader ali em cima.
		
		while(linha !=null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush(); //Para aparecer simultaneamente ao apertar enter.
			linha = br.readLine();
			
		}
		

		
		br.close(); //Para fechar o BufferedReader
		bw.close();

	}

}
