package jp.qilab.spring.web;

import java.util.List;

import javax.validation.Valid;

import jp.qilab.spring.domain.Hotel;
import jp.qilab.spring.form.HotelSearchForm;
import jp.qilab.spring.repository.HotelsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelSearch {

	@Autowired
	HotelsRepository hotelsRepository;
	
	@RequestMapping("/hotelSearch/")
	public ModelAndView index(
			@Valid HotelSearchForm hotelSearchForm, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView("hotelSearch/index");
		
		if (bindingResult.hasErrors()) {
			return modelAndView;
		}
		
		List<Hotel> hotelList = null;
		if (hotelSearchForm.getUpperPrice() != null) {
			hotelList = hotelsRepository.findByPriceLessThanEqual(hotelSearchForm.getUpperPrice());
		}
		
		modelAndView.addObject("hotelList", hotelList);
		
		return modelAndView;
	}
}
