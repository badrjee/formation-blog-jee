package fr.gtm.blog.domain;

import java.io.Serializable;

public class Adresse implements Entity, Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id ; 
	private String city ;
	private String postalCode ; 
	private String line ;
	
	private Auteur auteur ; 
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	

}
