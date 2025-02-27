package com.algaworks.curso.fjoo.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {
	
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.DAY_OF_MONTH, 27);
		c.set(Calendar.MONTH, 1);
		c.set(Calendar.YEAR, 2025);
		c.set(Calendar.HOUR_OF_DAY, 2);
		c.set(Calendar.MINUTE, 7);
		c.set(Calendar.SECOND, 30);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(c.getTime()));
		
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		
		c.roll(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
	}

}
