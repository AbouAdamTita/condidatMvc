package com.simo.condidat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.simo.condidat.dao.TestDAO;
import com.simo.condidat.model.Book;
import com.simo.condidat.model.Categorie;

@Service
public class TestServiceImp implements TestService {
	// on inject condidatDao (interface
	@Autowired
	private TestDAO testDao;

	@Override
	@Transactional
	public Book saveBook(Book theBook) {

		// get the current hibernate session

		// save or update the condidat

		return testDao.saveBook(theBook);
	}

	@Override
	@Transactional
	public Long saveCategorie(Categorie theCategorie) {
		// get the current hibernate session

		// save or update the condidat

		return testDao.saveCategorie(theCategorie);
	}

	@Override
	@Transactional
	public Categorie getCategorie(Long theIdCat) {

		return testDao.getCategorie(theIdCat);

	}

	@Override
	@Transactional
	public List<Categorie> getCategories() {

		return testDao.getCategories();
	}

	@Override
	@Transactional
	public void deleteCategorie(Long theIdCat) {
		 testDao.deleteCategorie(theIdCat);
		
	}
}
