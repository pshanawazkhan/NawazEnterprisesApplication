package com.nawaz.main.NawazEnterprisers.SpanarsController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nawaz.main.NawazEnterprisers.Security.EmployeeLogin;
import com.nawaz.main.NawazEnterprisers.SpanarsBusiness.SpanarsBusiness;
import com.nawaz.main.NawazEnterprisers.SpanarsComand.SpanarsCmd;
import com.nawaz.main.NawazEnterprisers.SpanarsJPA.Spanars;
import com.nawaz.main.NawazEnterprisers.SpanarsJPA.SpanarsTo;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.Splinkers;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.SplinkersTo;
import com.nawaz.main.NawazEnterprisers.SplinkerComand.SplikerCMD;
@Controller
public class SpannersController {

	@Autowired
	SpanarsBusiness spab;
	
	@RequestMapping(value="/spnarlogin")
	public ModelAndView getSpinkerLoginPage1() {
		
		
		ModelAndView mv = new ModelAndView("spnarlogin");
		
		
		return mv;
	}
	
	//tempovary line=============================
		@RequestMapping("spnarloginSubmit1")
		public String getPage() {
			
			return "addspnaritems";
		}
		
		//==============================================
	
	@RequestMapping(value="/spnarloginSubmit")
	public ModelAndView getSpinkerLoginPage(EmployeeLogin emp) {
		ModelAndView mv;
		if(emp.getUsername().equalsIgnoreCase("test") && emp.getPassword().equalsIgnoreCase("test")) {
			
			mv= new ModelAndView("addspnaritems");
			
			return mv;
			
		}
		
		mv = new ModelAndView("spnarlogin");
		
		
		return mv;
	}
	
	
	@RequestMapping("spnarSubmitDetails")
	public ModelAndView submitSplinkerDetails(SpanarsCmd spnrcmd) {
		ModelAndView mv ;
		
		boolean b= spab.addSpnarsDetails(spnrcmd);
		
		if(b) {
			
	mv = new ModelAndView("spaDetailsSuccess");
			return mv;
		}
	 mv = new ModelAndView("addspnaritems");
		
		return mv;
	}
	
	
	@RequestMapping("showSpnarDetails")
	public ModelAndView displaySplinkerDetails(HttpServletRequest req) {
		ModelAndView mv ;
		System.out.println("Dispalying all spanner details");
	SpanarsTo sto =new SpanarsTo();
		
	List<Spanars> l1= spab.getAllSpanarsDetails();
	
	sto.setSpato(l1);
		
		req.setAttribute("List1", sto);
		
	 mv = new ModelAndView("spanardisplaydetails");
		
		return mv;
	}
	
	
	
	
	
	
}
