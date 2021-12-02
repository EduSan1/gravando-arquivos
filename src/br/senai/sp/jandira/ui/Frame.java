package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.model.Arquivo;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class Frame extends JFrame {

	private JPanel contentPane;

	public Frame() {
		
		ArrayList<String> employees = new ArrayList<>();
		String caminho = "C:\\Users\\21276323\\Desktop\\jorge\\jorge.txt";
		Arquivo arquivo = new Arquivo();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblManipulacao = new JLabel("Manipula\u00E7\u00E3o de Arquivos");
		lblManipulacao.setBounds(10, 11, 141, 14);
		contentPane.add(lblManipulacao);
		
		JLabel lblTexto = new JLabel("texto");
		lblTexto.setBounds(10, 36, 35, 14);
		contentPane.add(lblTexto);
		
		JTextPane txtDigitar = new JTextPane();
		txtDigitar.setBounds(10, 58, 223, 192);
		contentPane.add(txtDigitar);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(243, 61, 150, 50);
		contentPane.add(btnGravar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(243, 183, 150, 50);
		contentPane.add(btnSair);
		
		JLabel lblArquivo = new JLabel("Texto no Arquivo:");
		lblArquivo.setBounds(399, 36, 96, 14);
		contentPane.add(lblArquivo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(409, 61, 223, 192);
		contentPane.add(scrollPane);
		
		JTextPane txtMostrar = new JTextPane();
		txtMostrar.setText(arquivo.lerArquivo(caminho));
		scrollPane.setViewportView(txtMostrar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setBounds(243, 122, 150, 50);
		contentPane.add(btnApagar);
		
		btnGravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				
				arquivo.escrever(caminho, arquivo.lerArquivo(caminho) + txtDigitar.getText(), employees);
				txtMostrar.setText(arquivo.lerArquivo(caminho));
				txtDigitar.setText("");
				
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		
		btnApagar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				arquivo.escrever(caminho, "" , employees);
				txtMostrar.setText(arquivo.lerArquivo(caminho));
				txtDigitar.setText("");
				
			}
		});
		
	}
}
