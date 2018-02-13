package com.simo.condidat.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.simo.condidat.model.Condidat;
import com.simo.condidat.service.CondidatService;

@Controller
@RequestMapping("/condidat")
public class CondidatController {
	// pour injecter condidat service
	@Autowired
	private CondidatService condidatService;
	
	// pour ajouter
		@GetMapping("/index")
		public String index() {
			

			return "index";
		}

	@GetMapping("/list")
	public String getCondidats(Model theModel) {
		// get customers from the service
		List<Condidat> theCondidats = condidatService.getCondidats();

		// add the condidats to the model
		theModel.addAttribute("condidats", theCondidats);

		return "condidat-list";

	}

	// pour ajouter
	@GetMapping("/showFormAdd")
	public String showFormAdd(Model theModel) {

		// create model attribute to bind form data
		Condidat theCondidat = new Condidat();

		theModel.addAttribute("condidat", theCondidat);

		return "condidat-add";
	}

	// pour save and uppdate condidat
	@PostMapping("/saveCondidat")
	public String saveCondidat(@ModelAttribute("condidat") Condidat theCondidat) {
		// save condidat from the service
		condidatService.saveCondidat(theCondidat);

		// return "condidat-list";
		return "redirect:/condidat/list";
	}
	
	// pour update
	// recuperer l id du request
	@GetMapping("/showFormUpdate")
	public String showFormUpdate(@RequestParam("condidatId") int theId, Model theModel) {

		// get the condidat from our service
		Condidat theCondidat = condidatService.getCondidat(theId);

		// set condidat as a model attribute to pre-populate the form
		theModel.addAttribute("condidat", theCondidat);

		return "condidat-add";
	}

	// pour delete
	// recuperer l id du request
	@GetMapping("/showFormDelete")
	public String showFormDelete(@RequestParam("condidatId") int theId, Model theModel) {

		// get the condidat from our service
		Condidat theCondidat = condidatService.getCondidat(theId);

		// set condidat as a model attribute to pre-populate the form
		theModel.addAttribute("condidat", theCondidat);

		return "condidat-delete";
		// System.out.println(theCondidat.toString());
		// condidatService.deleteCondidat(theId);

		// return "redirect:/condidat/list";
	}

	@PostMapping("/deleteCondidat")
	public String deleteCondidat(@ModelAttribute("condidat") Condidat theCondidat) {

		// delete the condidat

		int theId = theCondidat.getId();
		System.out.println(theCondidat.toString());

		condidatService.deleteCondidat(theId);

		return "redirect:/condidat/list";
	}

	// chercher des condidat avec le mot cle
	
	@PostMapping("/search")
	public String searchCondidats(@RequestParam("theMotCle") String  motCle, Model theModel) {

		// search customers from the service
		List<Condidat> theCondidats = condidatService.searchCondidats(motCle);

		// add the customers to the model
		theModel.addAttribute("condidats", theCondidats);

		return "condidat-list";
	}
	
	
	// pour ajouter
		@GetMapping("/showFormUplaod")
		public String showFormUplaod(Model theModel) {

			// create model attribute to bind form data
			Condidat theCondidat = new Condidat();

			theModel.addAttribute("condidat", theCondidat);

			return "uplaodPhoto";
		}

}
