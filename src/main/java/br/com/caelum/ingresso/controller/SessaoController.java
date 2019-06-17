package br.com.caelum.ingresso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;

@Controller	
public class SessaoController {
	
	@Autowired
	private SalaDao salaDao;
	@Autowired
	private FilmeDao filmeDao;
	
		@GetMapping("/admin/sessao")
		public ModelAndView form(@RequestParam("salaId") Interger salaId) {
			
			ModelAndView modelAndView = new ModelAndView("sessao/sessao");
			
		modelAndView.addObject("salaId", salaDao.findOne(salaID));
		modelAndView.addObject("filmes", filmeDao.findAll());
		
		return modelAndView;
	}
}
