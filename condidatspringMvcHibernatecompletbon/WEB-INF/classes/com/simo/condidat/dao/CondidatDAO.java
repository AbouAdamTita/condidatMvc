package com.simo.condidat.dao;


import java.util.List;

import com.simo.condidat.model.Book;
import com.simo.condidat.model.Categorie;
import com.simo.condidat.model.Condidat;

public interface CondidatDAO {
	
	List<Condidat> getCondidats();

	void saveCondidat(Condidat theCondidat);

	Condidat getCondidat(int theId);
	
	void deleteCondidat(int theId);

	List<Condidat> searchCondidats(String theMotCle);	
	
	
	public Book saveBook(Book theBook);
	public Categorie saveCategorie(Categorie theCategorie);

}
