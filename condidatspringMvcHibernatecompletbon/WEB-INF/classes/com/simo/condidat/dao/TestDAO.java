package com.simo.condidat.dao;




import java.util.List;

import com.simo.condidat.model.Book;
import com.simo.condidat.model.Categorie;

public interface TestDAO {
	
	
	public Book saveBook(Book theBook);
	public Long saveCategorie(Categorie theCategorie);
	public Categorie getCategorie(Long idCat);
	public List<Categorie> getCategories();
	public void deleteCategorie(Long theIdCat);

}
