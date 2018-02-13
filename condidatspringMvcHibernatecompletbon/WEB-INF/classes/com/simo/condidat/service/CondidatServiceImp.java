package com.simo.condidat.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simo.condidat.dao.CondidatDAO;
import com.simo.condidat.model.Condidat;

@Service
public class CondidatServiceImp implements CondidatService {
	// on inject condidatDao (interface
	@Autowired
	private CondidatDAO condidatDao;

	// get all condidats
	@Override
	@Transactional
	public List<Condidat> getCondidats() {
		return condidatDao.getCondidats();
	}

	// save or update condidat
	@Override
	@Transactional
	public void saveCondidat(Condidat theCondidat) {
		// ajouter condidat
		condidatDao.saveCondidat(theCondidat);

	}

	// get condidat
	@Override
	@Transactional
	public Condidat getCondidat(int theId) {

		return condidatDao.getCondidat(theId);
	}

	// delete condidat
	@Override
	@Transactional
	public void deleteCondidat(int theId) {
		// TODO Auto-generated method stub
		condidatDao.deleteCondidat(theId);
	}

	// Serach condidats
	@Override
	@Transactional
	public List<Condidat> searchCondidats(String theMotCle) {
		// chetrcher des condidats
		return condidatDao.searchCondidats(theMotCle);
	}
	
	
}
