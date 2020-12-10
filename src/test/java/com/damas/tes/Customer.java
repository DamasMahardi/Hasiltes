package com.damas.tes;

public class Customer {
	private Long cust_id;
	private String nama;
	private String alamat;
	private float pendapatan;
	public Customer(Long cust_id, String nama, String alamat, float pendapatan) {
		super();
		this.cust_id = cust_id;
		this.nama = nama;
		this.alamat = alamat;
		this.pendapatan = pendapatan;
	}
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public float getPendapatan() {
		return pendapatan;
	}
	public void setPendapatan(float pendapatan) {
		this.pendapatan = pendapatan;
	}
	
}