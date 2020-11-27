package com.abd.hospitalmgt.cont;

import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abd.hospitalmgt.entity.Appointment;
import com.abd.hospitalmgt.entity.Doctors;
import com.abd.hospitalmgt.entity.Patient;
import com.abd.hospitalmgt.helper.MessageAllerts;
import com.abd.hospitalmgt.repo.AppoinmentRepo;
import com.abd.hospitalmgt.repo.Doctorepo;
import com.abd.hospitalmgt.repo.Patientrepo;



@Controller
@RequestMapping("/user")
public class HomeController {

	@Autowired
	private BCryptPasswordEncoder bpe;
	
	@Autowired
	Patientrepo ps;
	
	@Autowired
	Doctorepo dr;
	
	@Autowired
	AppoinmentRepo appr;
	
	@Autowired
    private ServletContext servletContext;
	
	
	@GetMapping("/login")
	public String patientlogin() {
	
		return "login";
	}
	
	public static String capitalize(String str)
	{
	    if(str == null) return str;
	    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
	@GetMapping("/dashboard")
	public String home(Authentication authentication, Model model) {
		System.out.println("-------------"+authentication.getName());
		String str = capitalize(authentication.getName());
		
		model.addAttribute("pname", str);
		return "dashboard";
	}
	
	@GetMapping("/userRegister")
	public String userRegister() {
	
		return "register";
	}
	
	
	@PostMapping("/savePatient")
	public String savePatient(Patient patient,Model model) {
	
		try{
			System.out.println(patient);
			patient.setEnabled(true);
			patient.setRole("ROLE_PATIENT");
			patient.setPassword(bpe.encode(patient.getPassword()));
			ps.save(patient);
			
			MessageAllerts msg = new MessageAllerts("User Created Successfully",1);
			
			System.out.println(msg.getContent());
			model.addAttribute("savemsg", msg.getContent());
			return "login";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			MessageAllerts msg = new MessageAllerts("Failed to create new User",2);
			model.addAttribute("type", msg.getType());
			model.addAttribute("savemsg", msg.getContent()+"-"+e.getMessage());
			return "login";
		}
		
		
	}
	
	
	
	@GetMapping("/dept")
	public String Department(@RequestParam("id") int theid,Model model,Authentication authentication) {
		System.out.println(theid);
		List<Doctors> dlist = dr.findByFlag(theid);
		String str = capitalize(authentication.getName());
		model.addAttribute("pname", str);
		model.addAttribute("doctorlist", dlist);
		return "doctorlist";
	}
	
	
	@GetMapping("/appointment")
	public String appForm(@RequestParam("id") int theid,Model model,Authentication authentication) {
		System.out.println(theid);
		
		Optional<Doctors> doc = dr.findById(theid);
		if(doc.isPresent()) {
			String str = capitalize(authentication.getName());
			model.addAttribute("pname", str);
			model.addAttribute("doctordetails", doc.get());
			System.out.println(doc);
		} else {
		    //there is no Customer in the repo with 'id'
			System.out.println("there is no Doctor in the DB");
		}
		
		return "appform";
	}
	
	
	
	@PostMapping("/bookappt")
	public String Bookappt(Appointment app) {
		
		System.out.println(app);
		appr.save(app);
		
		return "redirect:/dashboard";
	}
	
	
	@GetMapping("/bookingHistory")
	public String BookingHistory(@RequestParam("pname") String pname,Model model) {
		System.out.println(pname);
		String str = capitalize(pname);
		model.addAttribute("pname", str);
		List<Appointment> list = appr.findByPname(pname);
		model.addAttribute("apptlist", list);
		return "appointmentlist";
	}
	
	@GetMapping("/logout")
	public String logout1() {
		
		return "redirect:/user/logout-success";
	}
	
	@GetMapping("/logout-success")
	public String logout() {
		
		return "login";
	}
	
	
	
	@GetMapping("/deleteappt")
	public String delete(@RequestParam("id") int theid) {
		appr.deleteById(theid);
		return "redirect:/dashboard";
	}
	
	
}
