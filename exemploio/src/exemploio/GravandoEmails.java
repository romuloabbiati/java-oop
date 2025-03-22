package exemploio;

import java.io.IOException;
import java.io.PrintWriter;

public class GravandoEmails {

	public static void main(String[] args) {
		
		String[] emails = { "romulo@email.com", "isabela@email.com", "elena@email.com" };
		
		
		
//		try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/romuloabbiati/Documents/misc/emails.txt", true))) {
		try (PrintWriter writer = new PrintWriter("/Users/romuloabbiati/Documents/misc/emails.txt")) {
			for (String email : emails) {
				writer.println(email);
			}
			
		} catch (IOException e) {
			System.err.println("Nao conseguiu gravar o arquivo. " + e.getMessage());
		}

	}

}
