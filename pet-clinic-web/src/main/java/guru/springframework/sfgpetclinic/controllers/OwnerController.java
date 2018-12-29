package guru.springframework.sfgpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;
	
	@RequestMapping({"", "/", "/index","/index.html"})
	public String listOwners(ModelMap model) {
		model.put("owners", ownerService.findAll());
		return "owners/index";
	}
}
