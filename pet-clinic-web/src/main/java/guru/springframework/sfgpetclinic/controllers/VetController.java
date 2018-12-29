package guru.springframework.sfgpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.VetService;

@Controller
public class VetController {

	@Autowired
	VetService vetservice;
	
	@RequestMapping({"/vets", "/vets/index","/vets/index.html"})
	public String listVets(ModelMap model) {
		model.put("vets", vetservice.findAll());
		return "vets/index";
	}
}
