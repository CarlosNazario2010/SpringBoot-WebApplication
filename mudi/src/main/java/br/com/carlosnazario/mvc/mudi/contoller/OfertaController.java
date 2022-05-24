package br.com.carlosnazario.mvc.mudi.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/oferta")
public class OfertaController {
	
	@GetMapping
	public String GetFormularioParaOfertas() {
		return "oferta/home";
	}
}
