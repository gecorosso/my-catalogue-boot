package it.catalogo.controller;
import java.awt.PageAttributes.MediaType;
import java.net.http.HttpRequest;

import org.springframework.http.HttpRange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.condition.ConsumesRequestCondition;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class WelcomeController {

//esercizio scrivi metodi di Request Mapping e di HttpSession
	
/*L'oggetto HttpServletRequest viene creato dal container servlet 
 * quando riceve una richiesta HTTP e viene passato al metodo di 
 * servizio (ad esempio, doGet() o doPost()) dell'applicazione 
 * web per elaborare la richiesta. Attraverso l'oggetto HttpServletRequest, 
 * è possibile recuperare informazioni sulla richiesta e interagire 
 * con i parametri e i dati inviati dal client.*/	

	
	//http://localhost:8080/mappa?nome=ciao
	//http://localhost:8080/path?nome=ciao
	//http://localhost:8080/citta?capitale=Roma
	//http://localhost:8080/elemento?alluminio=metallo
	//http://localhost:8080/sessione?nome=M
	
	
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}

	
	 @ResponseBody()
	 @RequestMapping(path = "/elemento", method = RequestMethod.GET)
	 public String mioElemento(HttpServletRequest metallo) {
		 
		 String test = metallo.getParameter("alluminio");
		 		 
		 if (test.equals("metallo")) {
			 return "esatto trattasi di un metallo";
		 }else {
			 return "il "+ metallo.getParameter("alluminio") + " non è un metallo";
		 }
	 }
	
	//http://localhost:8080/sessione?nome=M
	 
	 @ResponseBody
	 @RequestMapping(path = "/sessione",method = RequestMethod.GET)
	 public String mySex(HttpSession sessione ) {		 
		if ((sessione.getAttribute("nome")==null)){
			 sessione.setAttribute("nome", "GENNARO");
		}
		 return "Ciao " + sessione.getAttribute("nome").toString();
	 }
	
	 //Esercizio con @RequestParam
	//http://localhost:8080/auto?modello=FORD======> FIESTA 6 SERIE
	 
	@ResponseBody
	@GetMapping("/auto")
	public String miaAuto(@RequestParam("modello") String modello,@CookieValue("JSESSIONID") String consent ) {
		return modello+"cookie="+consent;
	}
	
	
	//http://localhost:8080/modello?modello=Samsung
	@ResponseBody
	@RequestMapping(path = "/miomodello_telefono",method = RequestMethod.GET)
	public String riCavaTelefono(@RequestParam("modello") String modello) {
		return "==>"+modello.toString()+"<==";
	}
	
	
	@ResponseBody
	@GetMapping("mioTelefono")
	public String altroTel(@RequestParam("modello") String modello ) {
		return "Altro Tel--->"+modello.toString()+"<-----Altro Tel";
	}
	
	
	
}
		
	
		

	


//Esercizio non GetMapping
