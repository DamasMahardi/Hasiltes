package com.damas.tes;

public class Kota {
	private char id_kota;
	private String nama_kota;
	public Kota(char id_kota, String nama_kota) {
		super();
		this.id_kota = id_kota;
		this.nama_kota = nama_kota;
	}
	public char getId_kota() {
		return id_kota;
	}
	public void setId_kota(char id_kota) {
		this.id_kota = id_kota;
	}
	public String getNama_kota() {
		return nama_kota;
	}
	public void setNama_kota(String nama_kota) {
		this.nama_kota = nama_kota;
	}
	

}
