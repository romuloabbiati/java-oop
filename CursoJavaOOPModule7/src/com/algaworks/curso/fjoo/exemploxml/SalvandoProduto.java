package com.algaworks.curso.fjoo.exemploxml;

import java.math.BigDecimal;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvandoProduto {

	public static void main(String[] args) {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		
		Produto sabonete = new Produto(1L, "sabonete", new BigDecimal("2.30"));
		
		String xml = xstream.toXML(sabonete);
		System.out.println(xml);

	}

}
