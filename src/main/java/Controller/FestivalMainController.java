package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Model.FestivalDTO;
import Service.FestivalListService;


@Controller
public class FestivalMainController {
	
	@Autowired
	private FestivalListService festivallistservice;
	public FestivalMainController(FestivalListService festivallistservice) {
	this.festivallistservice = festivallistservice;
}

	@RequestMapping(value="/festival/main", method = RequestMethod.GET )
	public String form(Model model,FestivalDTO dto) {
		List<FestivalDTO> Festivallist = festivallistservice.festivallist(dto);
		model.addAttribute("Festivallist", Festivallist);
		System.out.println("컨트롤러");
		
		return "festival/FestivalMain";
	
	}
	
	public String formPost() {
		// TODO Auto-generated method stub
		return null;
	}
}
