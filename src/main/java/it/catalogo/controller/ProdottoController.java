package it.catalogo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.catalogo.model.Prodotto;
import it.catalogo.repository.ProdottoRepository;

@Controller
@RequestMapping("/")
public class ProdottoController {
	@Autowired
	private ProdottoRepository repo;
	
	@GetMapping("/")
	public ModelAndView list() {
		Iterable<Prodotto> prods = repo.findAll();
		return new ModelAndView("index","listaProdotti",prods);
	}
	
	@PostMapping("/add")
	public String aggiungi(@ModelAttribute("datiProdotto") Prodotto p) {
		repo.save(p);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String canCellazione(@RequestParam("id") String id) {
		Prodotto prt = new Prodotto();
        prt.setId(Integer.parseInt(id));
		repo.delete(prt);		
		return "redirect:/";
	}
	
	
	@GetMapping("/update")
	public ModelAndView modiFica(@RequestParam("id") String id, ModelMap mm) {
		//Cerca il prodotto;
		Optional<Prodotto> prt = repo.findById(Integer.parseInt(id));
		mm.addAttribute("prodottoDaModificare",prt);
		return new ModelAndView("prodotti","listaModifiche",prt);
	}
	
	
	
	
	
}
