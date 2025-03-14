package com.algaworks.curso.fjoo.generics;

import java.util.List;

public class RetiraElementos {

	public static <T> T recuperaPrimeiro(List<T> list) {
		return list.get(0);
	}
	
}
