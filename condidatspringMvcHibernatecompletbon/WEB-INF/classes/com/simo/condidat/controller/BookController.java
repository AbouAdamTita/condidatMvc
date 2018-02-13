package com.simo.condidat.controller;
/*
import java.io.File;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simo.condidat.model.Book;

import com.simo.condidat.service.TestService;

@Controller
@RequestMapping("/book")

*/
class BookController {
	/*
	@Autowired
	private TestService testService;	
	
	// pour ajouter
		@GetMapping("/showBookAdd")
		public String showBookAdd(Model theModelBook) {

			// create model attribute to bind form data
			Book theBook = new Book();
			theBook.setNameBook("Book");
            System.out.println("creation du book ...");
            theModelBook.addAttribute("book", theBook);
			System.out.println("creation du book ... assosication dans le model ..."+theBook.getNameBook());
			return "book-add";
			

		}
	
		@PostMapping("/saveBook")
	//@GetMapping("/saveBook")
		public String saveBook(@ModelAttribute("book") Book theBook) {
			// save book from the service
			System.out.println("name de book "+theBook.getNameBook());
			File file = new File("C:\\images\\90.jpg"); //windows
	        //File file = new File("images/extjsfirstlook.jpg");
			
			System.out.println("instanciation ok file");
	        byte[] bFile = new byte[(int) file.length()];
	        System.out.println("length file "+bFile.toString());
	        try {
	            FileInputStream fileInputStream = new FileInputStream(file);
	            fileInputStream.read(bFile);
	            fileInputStream.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println("settimg  de book file ....."+theBook.getNameBook());
	       // Book theBook = new Book();
	       // theBook.setName("java");
	        theBook.setImage(bFile); 	        
	        System.out.println("file the book  ..."+theBook.getImage()+"  "+theBook.getNameBook());
			//condidatService.saveBook(theBook);
			System.out.println("creation du book ok felecitation ...");
			// return "condidat-list";
			return "redirect:/condidat/index";
		}
	*/		
		
}
