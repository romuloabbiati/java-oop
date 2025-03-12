package com.algaworks.curso.fjoo.arquivoproperties;

import java.io.FileInputStream;
import java.util.Properties;

public class LendoArquivoProperties {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("./config/config.properties"));
		
		String url = prop.getProperty("banco.dados.url");
		String usuario = prop.getProperty("banco.dados.usuario");
		String senha = prop.getProperty("banco.dados.senha");
		
		System.out.printf("Conectando no banco de dados de url: %s e usuario: %s\n", url, usuario);
		
		try {
			int x = 5 / 0;
		} catch (Exception e) {
			String email = prop.getProperty("email.admin");
			System.err.printf("Enviando email para: %s informando o erro: %s", email, e.getMessage());
		}

	}

}
