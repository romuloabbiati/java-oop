package com.algaworks.curso.fjoo.joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane3 {

	public static void main(String[] args) throws Exception {
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		Object[] opcoes = { "Sim", "Nao", "Sim, com e-mail" };
		
		int opcao = JOptionPane.showOptionDialog(null, "Voce gostaria de finalizar o cadastro?", "Confirmacao", JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);
		
		System.out.println("Opcao selecionada: " + opcao);

	}

}
