package com.simo.condidat.service;

import java.util.List;

import com.simo.condidat.model.Book;
import com.simo.condidat.model.Categorie;


public interface TestService {
	
		
	public Book saveBook(Book theBook);
	public Long saveCategorie(Categorie theCategorie);
	public Categorie getCategorie(Long theId);
	public List<Categorie> getCategories();
	public void deleteCategorie(Long theIdCat);
	
	
	
}
