package br.senai.sp.jandira;

import java.util.ArrayList;
import java.util.Scanner;

import br.senai.sp.jandira.model.Arquivo;
import br.senai.sp.jandira.ui.Frame;

public class App {

	public static void main(String[] args) {
		
//		String caminho = "C:\\Users\\21276323\\Desktop\\jorge\\jorge.txt";
//		
//		Arquivo objArquivo = new Arquivo();
//		
//		Scanner entrada = new Scanner(System.in);
//		System.out.println(objArquivo.lerArquivo(caminho));
//		System.out.println("O que vc deseja gravar?");
//		String texto = objArquivo.lerArquivo(caminho) + entrada.nextLine();
//		objArquivo.escrever(caminho, texto);
//		System.out.println(objArquivo.lerArquivo(caminho));
//		entrada.close();
		
		Frame frame = new Frame();
		frame.setVisible(true);

	}

}
