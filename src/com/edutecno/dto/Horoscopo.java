package com.edutecno.dto;

public class Horoscopo {

	private String signo;
	private String elemento;
	
	public Horoscopo() {}

	public Horoscopo(String signo, String elemento) {
		super();
		this.signo = signo;
		this.elemento = elemento;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	@Override
	public String toString() {
		return "Horoscopo [signo=" + signo + ", elemento=" + elemento + "]";
	}
	
	
}
