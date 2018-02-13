package com.simo.condidat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
	@Table(name="BOOK")
	public class Book {
	 
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="BOOK_ID")
	    private long id;
	    //@Column(name="BOOK_NAME", nullable=false)
	    @Column(name="BOOK_NAME", nullable=true)
	    private String nameBook;
	 
	    @Lob
	    //@Column(name="BOOK_IMAGE", nullable=false, columnDefinition="mediumblob")
	  @Column(name="BOOK_IMAGE", nullable=true, columnDefinition="mediumblob")
	    private byte[] image; 
	        
	 
	    public Book() {			
			
		}   
	    

		public Book(String nameBook, byte[] image) {
			super();
			this.nameBook = nameBook;
			this.image = image;
		}



		public long getId() {
	        return id;
	    }
	 
	    public void setId(long id) {
	        this.id = id;
	    }
	 
	    public String getNameBook() {
	        return nameBook;
	    }
	 
	    public void setNameBook(String nameBook) {
	        this.nameBook = nameBook;
	    }
	 
	    public byte[] getImage() {
	        return image;
	    }
	 
	    public void setImage(byte[] image) {
	        this.image = image;
	    }
	}


