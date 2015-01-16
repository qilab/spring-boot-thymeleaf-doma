package jp.qilab.spring.web.intermediate;

import java.util.List;

import javax.validation.Valid;

import jp.qilab.spring.dao.ClothesColorDao;
import jp.qilab.spring.dao.ClothesDao;
import jp.qilab.spring.dao.SexDao;
import jp.qilab.spring.domain.intermediate.ClothesColor;
import jp.qilab.spring.domain.intermediate.Sex;
import jp.qilab.spring.dto.ClothesDto;
import jp.qilab.spring.form.intermediate.Problem03Form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Transactional
public class IntermediateProblem03 {
	
	@Autowired
	SexDao sexDao;
	
	@Autowired
	ClothesColorDao clothesColorDao;
	
	@Autowired
	ClothesDao clothesDao;

	@RequestMapping("/intermediate/problem03/")
	public ModelAndView index(Problem03Form problem03Form) {
		ModelAndView modelAndView = new ModelAndView("intermediate/problem03/index");
		
		List<Sex> sexList = sexDao.selectAll();
		List<ClothesColor> clothesColorList = clothesColorDao.selectAll();
		
		modelAndView.addObject("sexList", sexList);
		modelAndView.addObject("clothesColorList", clothesColorList);
		
		return modelAndView;
	}

	@RequestMapping(value="/intermediate/problem03/", method=RequestMethod.POST)
	public ModelAndView search(
			@Valid Problem03Form problem03Form, BindingResult bindingResult) {
		// エラー時は、indexページにリダイレクト
		if (bindingResult.hasErrors()) {
			return new ModelAndView("redirect:" + "/intermediate/problem03/");
		}
		
		ModelAndView modelAndView = index(problem03Form);
		
		List<ClothesDto> clothesDtoList = clothesDao
				.selectByClothesColorIdAndSexId(
						problem03Form.getClothesColorId(),
						problem03Form.getSexId());
		modelAndView.addObject("clothesDtoList", clothesDtoList);
		
		return modelAndView;
	}
}
