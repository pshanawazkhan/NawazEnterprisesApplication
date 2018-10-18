package com.nawaz.main.NawazEnterprisers.SplinkerBusiness;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nawaz.main.NawazEnterprisers.SplikerJPA.SplinkerRepository;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.Splinkers;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.SplinkersTo;
import com.nawaz.main.NawazEnterprisers.SplinkerComand.SplikerCMD;

@Component
public class SplinkerBusiness {

	
	@Autowired
	SplinkerRepository srepo;
	
	
	
	public boolean addSplinkerDetails(SplikerCMD scmd) {
		
		Splinkers spl =new Splinkers();
		
		spl.setProductname(scmd.getProductname());
		spl.setPlace(scmd.getPlace());
		spl.setPrice(scmd.getPrice());
		
		try {
			
			srepo.save(spl);
			
		}catch(Exception e) {
			
			System.out.println("--------Exception Occured in SplinkerBusiness-->add()------");
			e.printStackTrace();
			System.out.println("------------------------------------------------------------");
			return false;
		}
		return true;
	}
	
	
	
	public List<Splinkers> getAllSplinkerDetails() {
		
		
		SplinkersTo sto = new SplinkersTo();
		
		
		List<Splinkers> l1= srepo.findAll();
		
		for(Splinkers spl: l1) {
			
			System.out.println("-----------------------");
			System.out.println(spl.getId()+"  "+spl.getProductname()+" "+spl.getPlace()+" "+" "+spl.getPrice());
			System.out.println("------------------------");
		}
		
		
	
		
		return l1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
