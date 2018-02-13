package com.simo.condidat.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simo.condidat.model.Book;
import com.simo.condidat.model.Categorie;


@Repository
public class TestDaoImp implements TestDAO {

	// pour injecter the session factory
	@Autowired
	private SessionFactory sessionFactory;

	
	
	 public Book saveBook(Book theBook) {
		 
		// get the current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
			// save or update the condidat
			currentSession.save(theBook);
	       
	        return theBook;
	    }

	

	@Override
	public Long saveCategorie(Categorie theCategorie) {
		// get the current hibernate session
					Session currentSession = sessionFactory.getCurrentSession();
					// save or update the condidat
					currentSession.saveOrUpdate(theCategorie);
			       
			        return theCategorie.getId();
	}



	@Override
	public Categorie getCategorie(Long theIdCat) {
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				// get condidat by id
				Categorie theCategorie = currentSession.get(Categorie.class,theIdCat);
				return theCategorie;		
		
	}
	@Override
	public List<Categorie> getCategories(){
		
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();

				// create a query sort by id
				Query<Categorie> theQuery = currentSession.createQuery("select c from Categorie c",Categorie.class);
				// execute query and get result list
				List<Categorie> categories = theQuery.getResultList();

				// return the results
				return categories;	
		
		}
	public void deleteCategorie(Long theIdCat) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// delete the obect condidat
		currentSession.delete(getCategorie(theIdCat));

		// currentSession.delete(theId);

	}



	
	
}
