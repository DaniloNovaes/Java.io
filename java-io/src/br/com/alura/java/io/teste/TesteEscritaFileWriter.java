package br.com.alura.java.io.teste;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		
		//Fluxo de Entrada com Arquivo
		
		//OutputStream fos = new FileOutputStream("lorem2.txt"); 
		//Writer osw = new OutputStreamWriter(fos); 
		//BufferedWriter bw = new BufferedWriter(osw);
		
		
		//SEM O OUTPUT, WRITER E BUFFERED FICARIA ASSIM
		//FileWriter fw = new FileWriter("lorem2.txt");
		//fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		//fw.write("\r\n");//PARA CRIAR UMA NOVA LINHA
		//fw.write(System.lineSeparator());//PARA CRIAR UMA NOVA LINHA
		//fw.write(System.lineSeparator());//PARA CRIAR UMA NOVA LINHA
		//fw.write("dsauhasufhas sdfauhfuads sfdauhfudas hfdsaifha sa gd d");

		//COM FILEWRITER E BUFFERED SOMENTE
		//COM O BUFFERED, POSSO USAR O NEWLINE(), QUE JÁ FAZ O SYSTEM.LINESEPARATOR
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do danilo eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("Danilo shdsihji Dan sudhaudhsau");

		
		bw.close(); //Para fechar o BufferedWriter
		

	}

}
