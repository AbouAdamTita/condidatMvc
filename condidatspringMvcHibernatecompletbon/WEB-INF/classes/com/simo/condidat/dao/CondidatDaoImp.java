package com.simo.condidat.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simo.condidat.model.Book;
import com.simo.condidat.model.Categorie;
import com.simo.condidat.model.Condidat;

@Repository
public class CondidatDaoImp implements CondidatDAO {

	// pour injecter the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Condidat> getCondidats() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query sort by id
		Query<Condidat> theQuery = currentSession.createQuery("from Condidat order by lastName", Condidat.class);

		// execute query and get result list
		List<Condidat> condidats = theQuery.getResultList();

		// return the results
		return condidats;
	}

	@Override
	public void saveCondidat(Condidat theCondidat) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// save or update the condidat
		currentSession.saveOrUpdate(theCondidat);

	}
	

	@Override
	public Condidat getCondidat(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// get condidat by id
		Condidat theCondidat = currentSession.get(Condidat.class, theId);
		return theCondidat;
	}

	@Override
	public void deleteCondidat(int theId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		// delete the obect condidat
		currentSession.delete(getCondidat(theId));

		// currentSession.delete(theId);

	}

	// Serach
	@Override
	public List<Condidat> searchCondidats(String theMotCle) {

		Query<Condidat> theQuery = null;
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query sort by id//Query<Condidat>

		//
		// only search by name if theSearchName is not empty
		//
		if (theMotCle != null && theMotCle.trim().length() > 0) {
			// search for firstName or lastName ... case insensitive
			theQuery = currentSession.createQuery("from Condidat where lower(lastName) like :mc"
					+ " or lower(firstName) like :mc order by id", Condidat.class);
			// set the parametre
			theQuery.setParameter("mc", '%' + theMotCle.toLowerCase() + '%');
		} else {
			// motCleis empty ... so just get all condidats
			theQuery = currentSession.createQuery("from Condidat order by lastName DESC", Condidat.class);
		}

		// execute query and get result list
		List<Condidat> condidats = theQuery.getResultList();

		// return the results
		return condidats;
	}
	
	 public Book saveBook(Book theBook) {
		 
		// get the current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
			// save or update the condidat
			currentSession.save(theBook);
	       
	        return theBook;
	    }

	

	@Override
	public Categorie saveCategorie(Categorie theCategorie) {
		// get the current hibernate session
					Session currentSession = sessionFactory.getCurrentSession();
					// save or update the condidat
					currentSession.save(theCategorie);
			       
			        return theCategorie;
	}
	
	
	
	
}
