package jp.qilab.spring.web;

import java.util.List;

import javax.validation.Valid;

import jp.qilab.spring.dao.ClothesColorDao;
import jp.qilab.spring.dao.ClothesDao;
import jp.qilab.spring.dao.SexDao;
import jp.qilab.spring.domain.ClothesColor;
import jp.qilab.spring.domain.Sex;
import jp.qilab.spring.dto.ClothesDto;
import jp.qilab.spring.form.ClothesSearchForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Transactional
public class ClothesSearch {
	
	@Autowired
	SexDao sexDao;
	
	@Autowired
	ClothesColorDao clothesColorDao;
	
	@Autowired
	ClothesDao clothesDao;

	@RequestMapping("/clothesSearch/")
	public ModelAndView index(ClothesSearchForm clothesSearchForm) {
		ModelAndView modelAndView = new ModelAndView("clothesSearch/index");
		
		List<Sex> sexList = sexDao.selectAll();
		List<ClothesColor> clothesColorList = clothesColorDao.selectAll();
		
		modelAndView.addObject("sexList", sexList);
		modelAndView.addObject("clothesColorList", clothesColorList);
		
		return modelAndView;
	}

	@RequestMapping(value="/clothesSearch/", method=RequestMethod.POST)
	public ModelAndView search(
			@Valid ClothesSearchForm clothesSearchForm, BindingResult bindingResult) {
		// エラー時は、indexページにリダイレクト
		if (bindingResult.hasErrors()) {
			return new ModelAndView("redirect:" + "/clothesSearch/");
		}
		
		ModelAndView modelAndView = index(clothesSearchForm);
		
		List<ClothesDto> clothesDtoList = clothesDao
				.selectByClothesColorIdAndSexId(
						clothesSearchForm.getClothesColorId(),
						clothesSearchForm.getSexId());
		modelAndView.addObject("clothesDtoList", clothesDtoList);
		
		return modelAndView;
	}
}
