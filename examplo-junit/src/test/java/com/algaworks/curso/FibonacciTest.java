package com.algaworks.curso;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	
	private Fibonacci fibonacci;
	
	@Before
	public void init() {
		fibonacci = new Fibonacci();
	}
	
	@Test
	public void deve_retornar_fibonacci_posicao_1() {
		// 1. Cenario
		long posicao = 1L;
		
		// 2. Acao
		long valor = fibonacci.calcular(posicao);
		
		// 3. Validacao
		assertEquals(1L, valor);
		
	}
	
	@Test
	public void deve_retornar_fibonacci_posicao_2() {
		// 1. Cenario
		long posicao = 2L;
		
		// 2. Acao
		long valor = fibonacci.calcular(posicao);
		
		// 3. Validacao
		assertEquals(1L, valor);
		
	}
	
	@Test
	public void deve_retornar_fibonacci_posicao_0() {
		// 1. Cenario
		long posicao = 0L;
		
		// 2. Acao
		long valor = fibonacci.calcular(posicao);
		
		// 3. Validacao
		assertEquals(0L, valor);
		
	}

}
