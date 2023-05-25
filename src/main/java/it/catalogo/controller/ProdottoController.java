package it.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.catalogo.model.Prodotto;
import it.catalogo.repository.ProdottoRepository;

@Controller
@RequestMapping("/")
public class ProdottoController {
	@Autowired
	private ProdottoRepository repo;
	
	@GetMapping("/")
	public String list() {
		Iterable<Prodotto> prods = repo.findAll();
		
//		prods.forEach((Prodotto p)->{
//			System.out.println(p.getNome());
//		});
		
		
		return "index";
	}
	
	@PostMapping("/add")
	public String aggiungi(@ModelAttribute("datiProdotto") Prodotto p) {
		repo.save(p);
		return "redirect:/";
	}
	
	
	@PostMapping("/update")
	public String modiFica() {
		repo.save(null);
		return "index";
	}
	
	@GetMapping("delete")
	public String canCellazione() {
		repo.delete(null);
		return "index";
	}
	
	
	
}
