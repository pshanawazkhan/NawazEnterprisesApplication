package com.nawaz.main.NawazEnterprisers.Tools;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nawaz.main.NawazEnterprisers.Security.EmployeeLogin;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.Splinkers;
import com.nawaz.main.NawazEnterprisers.SplikerJPA.SplinkersTo;
import com.nawaz.main.NawazEnterprisers.SplinkerComand.SplikerCMD;
import com.nawaz.main.NawazEnterprisers.ToolsBusiness.ToolsBusiness;
import com.nawaz.main.NawazEnterprisers.ToolsCMD.ToolsCMD;
import com.nawaz.main.NawazEnterprisers.ToolsJPA.Tools;
import com.nawaz.main.NawazEnterprisers.ToolsJPA.ToolsTo;

@Controller
public class ToolsControllers {

	@Autowired
	ToolsBusiness tbus;
	
	
	@RequestMapping("/")
	public String getPage11() {
		
		System.out.println("controler has reached to console**************");
		
		return "home";
	}
	
	
	
	
	
	@RequestMapping(value="toolslogin")
	public ModelAndView getSpinkerLoginPage1() {
		
		
		ModelAndView mv = new ModelAndView("toolslogin");
		
		
		return mv;
	}
	
	//tempovary line=============================
		@RequestMapping("toolsLoginSubmit1")
		public String getPage() {
			
			return "addtoolsitems";
		}
		
		//==============================================
	//toolsloginSubmit
	
	@RequestMapping(value="/toolsloginSubmit")
	public ModelAndView getSpinkerLoginPage(EmployeeLogin emp) {
		ModelAndView mv;
		if(emp.getUsername().equalsIgnoreCase("test") && emp.getPassword().equalsIgnoreCase("test")) {
			
			mv= new ModelAndView("addtoolsitems");
			
			return mv;
			
		}
		
		mv = new ModelAndView("toolslogin");
		
		
		return mv;
	}
	//toolsSubmitDetails
	
	@RequestMapping("toolsSubmitDetails")
	public ModelAndView submitSplinkerDetails(ToolsCMD tcmd) {
		ModelAndView mv ;
		
		boolean b= tbus.addToolsDetails(tcmd);
		
		if(b) {
			
	mv = new ModelAndView("toolsDetailsSuccess");
			return mv;
		}
	 mv = new ModelAndView("addtoolsitems");
		
		return mv;
	}
	
	
	@RequestMapping("showToolsDetails")
	public ModelAndView displaySplinkerDetails(HttpServletRequest req) {
		ModelAndView mv ;
		
	ToolsTo tto = new ToolsTo();
		
	List<Tools> l1= tbus.getAllToolsDetails();
	
       tto.setL1(l1);
		
		req.setAttribute("List1", tto);
		
	 mv = new ModelAndView("toolsdisplaydetails");
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
}
