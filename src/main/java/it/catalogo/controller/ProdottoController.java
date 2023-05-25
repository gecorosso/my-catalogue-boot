package it.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.catalogo.model.Prodotto;
import it.catalogo.repository.ProdottoRepository;

@Controller
@RequestMapping("/prodotto")
public class ProdottoController {
	@Autowired
	private ProdottoRepository repo;
	
	@GetMapping("/lista")
	public String list() {
		Iterable<Prodotto> prods = repo.findAll();
		
		prods.forEach((Prodotto p)->{
			System.out.println(p.getNome());
		});
		
		
		
		
		return "prodotti";
	}
	
	
	
}
