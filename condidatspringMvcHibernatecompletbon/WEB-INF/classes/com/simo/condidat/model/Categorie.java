package com.simo.condidat.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity	
	public class Categorie implements Serializable {
	 
	private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)	   
	    private long id;	    
		@Column(name="nom")
	    private String nom;	 
	    @Lob	    
	    private byte[] photo; 
	        
	 
	    public Categorie() {			
			
		}


		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public byte[] getPhoto() {
			return photo;
		}


		public void setPhoto(byte[] photo) {
			this.photo = photo;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (id ^ (id >>> 32));
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Categorie other = (Categorie) obj;
			if (id != other.id)
				return false;
			return true;
		}   
	    

	}


