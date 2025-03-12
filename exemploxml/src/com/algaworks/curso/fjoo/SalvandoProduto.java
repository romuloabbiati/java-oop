package com.algaworks.curso.fjoo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

import com.algaworks.curso.fjoo.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class SalvandoProduto {

	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		
		Produto sabonete = new Produto(1L, "sabonete", new BigDecimal("2.30"));
		
		String xml = xstream.toXML(sabonete);
		
		System.out.println(xml);
		
		OutputStream os = new FileOutputStream("./produto1.xml");
		xstream.toXML(sabonete, os);

	}

}
