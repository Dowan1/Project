package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.FestivalDTO;
import repository.FestivalRepository;
@Service
public class FestivalListService {

	@Autowired
	private FestivalRepository festivalRepository;
	
	public List<FestivalDTO> festivallist(FestivalDTO dto) {
		// TODO Auto-generated method stub
		String path = null;
		List<FestivalDTO> result = festivalRepository.festivallist(dto);
		System.out.println("서비스");
		
		return result;
	
	}

}
