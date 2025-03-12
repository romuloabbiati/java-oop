package com.algaworks.curso.fjoo.varargs;

public class TesteCorreioEletronico {

	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();
		
//		String[] emails = new String[2];
//		emails[0] = "romuloabbiati@hotmail.com";
//		emails[1] = "isabelagoto@hotmail.com";
		
//		correio.enviarEmails(new String[] { "romuloabbiati@hotmail.com", "isabelagoto@hotmail.com" });
		correio.enviarEmails("romuloabbiati@hotmail.com", "isabelagoto@hotmail.com", "elenagotoabbiati@hotmail.com");

	}

}
