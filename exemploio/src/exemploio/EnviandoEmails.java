package exemploio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("/Users/romuloabbiati/Documents/misc/emails.txt"))) {
			
//			String email = reader.readLine();
//			
//			while (email != null && !email.trim().equals("")) {
//				System.out.println("Enviando e-mail para: " + email);
//				email = reader.readLine();
//			}
			
			String email = null;
			
			while ((email = reader.readLine()) != null) {
				System.out.println("Enviando e-mail para: " + email);
			}
			
		} catch (IOException e) {
			System.err.println("Nao conseguiu ler o arquivo. Erro: " + e.getMessage());
		}

	}

}
