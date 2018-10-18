package com.nawaz.main.NawazEnterprisers.SplinkersControllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nawaz.main.NawazEnterprisers.Security.EmployeeLogin;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.Splinkers;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.SplinkersTo;
import com.nawaz.main.NawazEnterprisers.SplinkerBusiness.SplinkerBusiness;
import com.nawaz.main.NawazEnterprisers.SplinkerComand.SplikerCMD;

@Controller
public class SplinkersControllers {

	@Autowired
	SplinkerBusiness splb;
	
	@RequestMapping(value="/spllogin")
	public ModelAndView getSpinkerLoginPage1() {
		
		
		ModelAndView mv = new ModelAndView("spllogin");
		
		
		return mv;
	}
	
	//tempovary line=============================
	@RequestMapping("splloginSubmit1")
	public String getPage() {
		
		return "addSplItems";
	}
	
	//==============================================
	@RequestMapping(value="/splloginSubmit")
	public ModelAndView getSpinkerLoginPage(EmployeeLogin emp) {
		ModelAndView mv;
		if(emp.getUsername().equalsIgnoreCase("test") && emp.getPassword().equalsIgnoreCase("test")) {
			
			mv= new ModelAndView("addSplItems");
			
			return mv;
			
		}
		
		mv = new ModelAndView("spllogin");
		
		
		return mv;
	}
	
	@RequestMapping("splSubmitDetails")
	public ModelAndView submitSplinkerDetails(SplikerCMD scmd) {
		ModelAndView mv ;
		
		boolean b= splb.addSplinkerDetails(scmd);
		
		if(b) {
			
	mv = new ModelAndView("splDetailsSuccess");
			return mv;
		}
	 mv = new ModelAndView("addSplItems");
		
		return mv;
	}
	
	@RequestMapping("showSplDetails")
	public ModelAndView displaySplinkerDetails(HttpServletRequest req) {
		ModelAndView mv ;
		
	SplinkersTo sto =new SplinkersTo();
		
	List<Splinkers> l1= splb.getAllSplinkerDetails();
	
	sto.setSplTo(l1);
		
		req.setAttribute("List", sto);
		
	 mv = new ModelAndView("spldisplaydetails");
		
		return mv;
	}
	
	
	
	
	
	
	
	
}
