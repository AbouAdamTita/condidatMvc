package com.simo.condidat.service;


import java.util.List;


import com.simo.condidat.model.Condidat;

public interface CondidatService {
	
	List<Condidat> getCondidats();
	
	void saveCondidat(Condidat theCondidat);
	
	Condidat getCondidat(int theId);

	void deleteCondidat(int theId);

	List<Condidat> searchCondidats(String theMotCle);
	
	
	
	
}
