package com.nawaz.main.NawazEnterprisers.SpanarsBusiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nawaz.main.NawazEnterprisers.SpanarsComand.SpanarsCmd;
import com.nawaz.main.NawazEnterprisers.SpanarsJPA.Spanars;
import com.nawaz.main.NawazEnterprisers.SpanarsJPA.SpanarsRepository;
import com.nawaz.main.NawazEnterprisers.SpanarsJPA.SpanarsTo;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.SplinkerRepository;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.Splinkers;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.SplinkersTo;
import com.nawaz.main.NawazEnterprisers.SplinkerComand.SplikerCMD;
@Component
public class SpanarsBusiness {

	@Autowired
	SpanarsRepository srepo;
	
	
	
	public boolean addSpnarsDetails(SpanarsCmd scmd) {
		
		Spanars spa = new Spanars();
		
		spa.setProductname(scmd.getProductname());
		spa.setPlace(scmd.getPlace());
		spa.setPrice(scmd.getPrice());
		
		try {
			
			srepo.save(spa);
			
		}catch(Exception e) {
			
			System.out.println("--------Exception Occured in SpanarBusiness-->add()------");
			e.printStackTrace();
			System.out.println("------------------------------------------------------------");
			return false;
		}
		return true;
	}
	
	
	
	public List<Spanars> getAllSpanarsDetails() {
		
		
	  SpanarsTo spaTo = new SpanarsTo();
		
		
		List<Spanars> l1= srepo.findAll();
		
		for(Spanars spa: l1) {
			
			System.out.println("-----------------------");
			System.out.println(spa.getId()+"  "+spa.getProductname()+" "+spa.getPlace()+" "+" "+spa.getPrice());
			System.out.println("------------------------");
		}
		
		
	
		
		return l1;
	}
	
	
	
	
	
	
	
	
}
