package com.nawaz.main.NawazEnterprisers.ToolsBusiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.nawaz.main.NawazEnterprisers.ToolsCMD.ToolsCMD;
import com.nawaz.main.NawazEnterprisers.ToolsJPA.Tools;
import com.nawaz.main.NawazEnterprisers.ToolsJPA.ToolsRepository;
import com.nawaz.main.NawazEnterprisers.ToolsJPA.ToolsTo;

@Component
public class ToolsBusiness {

	@Autowired
	ToolsRepository trepo;
	
	
public boolean addToolsDetails(ToolsCMD tcmd) {
		
		Tools tools = new Tools();
		
		tools.setProductname(tcmd.getProductname());
		tools.setPlace(tcmd.getPlace());
		tools.setPrice(tcmd.getPrice());
		
		try {
			
			trepo.save(tools);
			
		}catch(Exception e) {
			
			System.out.println("--------Exception Occured in SplinkerBusiness-->add()------");
			e.printStackTrace();
			System.out.println("------------------------------------------------------------");
			return false;
		}
		return true;
	}
	
	
	
	public List<Tools> getAllToolsDetails() {
		
		
		ToolsTo tto = new ToolsTo(); 
		
		
		List<Tools> l1= trepo.findAll();
		
		for(Tools t: l1) {
			
			System.out.println("-----------------------");
			System.out.println(t.getId()+"  "+t.getProductname()+" "+t.getPlace()+" "+" "+t.getPrice());
			System.out.println("------------------------");
		}
		
		
	
		
		return l1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
