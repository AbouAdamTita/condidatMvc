package com.simo.condidat.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.validation.Valid;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.simo.condidat.model.Categorie;
import com.simo.condidat.model.Condidat;
import com.simo.condidat.service.TestService;

@Controller
@RequestMapping("/test")
class TestController {
	@Autowired
	private TestService testService;

	// List des categorie

	@GetMapping("/listCat")
	public String getCategories(Model theModel) {
		// get customers from the service		
		List<Categorie> theCategories = testService.getCategories();
		// add the condidats to the model
		theModel.addAttribute("categories", theCategories);
		return "categorie-list";
	}

	// show forme add
	@RequestMapping("/showCatAdd")
	public String showCatAdd(Model theModel) {
		// create model attribute to bind form data
		Categorie theCategorie = new Categorie();
		theCategorie.setNom("cat1");
		theCategorie.setPhoto(new byte[1024]);
		theModel.addAttribute("categorie", theCategorie);
		return "cat-add";
	}

	// ********ca marche save photo et update photot*************
	
	@RequestMapping("/saveCat")
	public String saveCat(@Valid Categorie theCategorie, BindingResult bindingResult, Model model, MultipartFile file)
			throws Exception {
			//traitement des erreurs
		if (bindingResult.hasErrors()) {
			//recuperer la liste des categorie  pour l envoyer dans le model 
			model.addAttribute("categories", testService.getCategories());
			return "categorie-list";
		}
			//verfier que le fichier a aupload est non vide 
		if (!file.isEmpty()) {
			// pout traiter l image
			BufferedImage bi = ImageIO.read(file.getInputStream());
			// set la categorie avec la nouvelle photo
			theCategorie.setPhoto(file.getBytes());
		}
			// si la categorie est en modification
		if (theCategorie.getId() != 0) {
			// si on modifie la categorie sans modifier la photo alors on prend la photo de
			// la categorie a editer
			if (file.isEmpty()) {
				// recuperer la photo actuelle et l ajouter a la categorie
				Categorie cat = testService.getCategorie(theCategorie.getId());
				theCategorie.setPhoto(cat.getPhoto());
			}
		}
			// save et update categorie avec photo
		testService.saveCategorie(theCategorie);
			// ajouter la liste
		model.addAttribute("categorie", new Categorie());
		model.addAttribute("categories", testService.getCategories());
		return "categorie-list";
	}

	// *** get image for categorie lecture du image **** 

	@RequestMapping(value = "/photoCat", produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody // pour que le retour se fait dans le corps de la requette pas dan une vue
	public byte[] photoCat(Long theIdCat) throws IOException {
			// get categorie by id
		Categorie theCategorie = testService.getCategorie(theIdCat);
			// test if file is empty
		if (theCategorie.getPhoto() == null)
			// return photo null
			return new byte[0];
		else
			return IOUtils.toByteArray(new ByteArrayInputStream(theCategorie.getPhoto()));
	}

	// pour update
	// recuperer l id du request
	@GetMapping("/showCatUpdate")
	public String showCatUpdate(@RequestParam("theIdCat") Long theIdCat, Model theModel) throws IOException {

		Categorie theCategorie = testService.getCategorie(theIdCat);
		theModel.addAttribute("categorie", theCategorie);
		theModel.addAttribute("categories", testService.getCategories());		
       // retourne la vue 
		return "cat-add";
	}
	
	// pour delete
		// recuperer l id du request
		@GetMapping("/showCatDelete")
		public String showFormDelete(@RequestParam("theIdCat") Long theIdCat, Model theModel) {

			// get the categoriet from our service
			Categorie theCategorie = testService.getCategorie(theIdCat);

			// set condidat as a model attribute to pre-populate the form
			theModel.addAttribute("categorie", theCategorie);

			return "cat-delete";			

			// return "redirect:/condidat/list";
		}

		@PostMapping("/deleteCat")
		public String deleteCondidat(@ModelAttribute("categorie") Categorie theCategorie) {

			// delete the ccategirie

			Long theIdCat = theCategorie.getId();
			System.out.println(theCategorie.toString());

			testService.deleteCategorie(theIdCat);

			return "redirect:/test/listCat";
		}


}
