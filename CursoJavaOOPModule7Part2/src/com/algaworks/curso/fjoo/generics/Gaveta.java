package com.algaworks.curso.fjoo.generics;

import java.util.ArrayList;
import java.util.List;

public class Gaveta<E> {

	private List<E> colecao = new ArrayList<E>();
	
	public void colocar(E e) {
		colecao.add(e);
	}
	
	public E retirarPrimeiro() {
		return colecao.get(0);
	}
	
}
