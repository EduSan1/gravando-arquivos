package br.senai.sp.jandira.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Arquivo {

//	Cria o arquivo quando ele n existir, e grava os dados no arquivo
	public boolean escrever(String path, String text, ArrayList<String> employees) {
		
		String line = "";

		try {

			// objeto que representa o arquivo
			FileWriter file = new FileWriter(path);

			// objeto que representa a manipulação dos dados no arquivo
			PrintWriter escreverArq = new PrintWriter(file);
			
			

			escreverArq.append(text);
			escreverArq.close();
			return true;

		} catch (IOException e) {

			System.out.println("Erro: " + e.getMessage());
			return false;

		}

	}

	public String lerArquivo(String path) {
		String conteudo = "";

		try {

			// representa o arquivo em modo de leitura
			FileReader arquivo = new FileReader(path);

			// representa o dado de leitura na memoria principal do programa
			BufferedReader lerArq = new BufferedReader(arquivo);

			String linha = "";
			linha = lerArq.readLine();
			while (linha != null) {
				conteudo += linha + "\n";
				linha = lerArq.readLine();
			}
			arquivo.close();
			return conteudo;

		} catch (IOException e) {

			System.out.println("Erro: " + e.getMessage());
			return "";

		}

	}

}
