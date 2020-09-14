package com.edutecno.dto;

public class Data_cambio_clave {

	private String user;
	private String passo;
	private String passn;
	
	public Data_cambio_clave() {}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasso() {
		return passo;
	}

	public void setPasso(String passo) {
		this.passo = passo;
	}

	public String getPassn() {
		return passn;
	}

	public void setPassn(String passn) {
		this.passn = passn;
	}

	@Override
	public String toString() {
		return "Data_cambio_clave [user=" + user + ", passo=" + passo + ", passn=" + passn + "]";
	}
}
