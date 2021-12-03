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
import java.awt.Color;

public class Frame extends JFrame {

	private JPanel contentPane;

	public Frame() {
		setBackground(new Color(0, 51, 0));
		
		ArrayList<String> employees = new ArrayList<>();
		String caminho = "C:\\Users\\21276323\\Desktop\\jorge\\jorge.txt";
		Arquivo arquivo = new Arquivo();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblManipulacao = new JLabel("Manipula\u00E7\u00E3o de Arquivos");
		lblManipulacao.setForeground(Color.WHITE);
		lblManipulacao.setBackground(Color.WHITE);
		lblManipulacao.setBounds(10, 11, 223, 14);
		contentPane.add(lblManipulacao);
		
		JLabel lblTexto = new JLabel("Texto:");
		lblTexto.setForeground(Color.WHITE);
		lblTexto.setBounds(10, 36, 35, 14);
		contentPane.add(lblTexto);
		
		JTextPane txtDigitar = new JTextPane();
		txtDigitar.setBounds(10, 58, 223, 192);
		contentPane.add(txtDigitar);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setForeground(new Color(0, 0, 255));
		btnGravar.setBackground(new Color(0, 0, 51));
		btnGravar.setBounds(243, 58, 150, 50);
		contentPane.add(btnGravar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(new Color(255, 255, 0));
		btnSair.setBackground(new Color(51, 51, 0));
		btnSair.setBounds(243, 200, 150, 50);
		contentPane.add(btnSair);
		
		JLabel lblArquivo = new JLabel("Texto no Arquivo:");
		lblArquivo.setForeground(Color.WHITE);
		lblArquivo.setBounds(409, 36, 141, 14);
		contentPane.add(lblArquivo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(409, 61, 223, 192);
		contentPane.add(scrollPane);
		
		JTextPane txtMostrar = new JTextPane();
		txtMostrar.setText(arquivo.lerArquivo(caminho));
		scrollPane.setViewportView(txtMostrar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setForeground(new Color(255, 0, 0));
		btnApagar.setBackground(new Color(51, 0, 0));
		btnApagar.setBounds(243, 129, 150, 50);
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
