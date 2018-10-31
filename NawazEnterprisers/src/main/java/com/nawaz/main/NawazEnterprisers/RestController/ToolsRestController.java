package com.nawaz.main.NawazEnterprisers.RestController;


import io.swagger.annotations.Api;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nawaz.main.NawazEnterprisers.ToolsJPA.Tools;
import com.nawaz.main.NawazEnterprisers.ToolsJPA.ToolsRepository;

@RestController
@RequestMapping("/api")
@Api(value = "Tools Rest Controller", description = "Tools Price List")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class ToolsRestController {

	
	@Autowired
	ToolsRepository tr;
	
	 
	
	@GetMapping("/gettools")
	public List<Tools> getAllToolsDetails(){
		
		System.out.println("Tools Rest controller----->getAllToolsDetails ()");
		
		return tr.findAll();
	}
	
	

	
	
	
	
	
}
