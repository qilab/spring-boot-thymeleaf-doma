package jp.qilab.spring.web;

import java.util.List;

import javax.validation.Valid;

import jp.qilab.spring.domain.BaseballTeam;
import jp.qilab.spring.dto.BaseballTeamDto;
import jp.qilab.spring.form.BaseballTeamsForm;
import jp.qilab.spring.repository.BaseballTeamsRepository;
import jp.qilab.spring.utils.TextUtil;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseballTeams {

	@Autowired
	BaseballTeamsRepository baseballTeamsRepository;
	
	@RequestMapping("/baseballTeams/")
	public ModelAndView index(BaseballTeamsForm baseballTeamsForm) {
		ModelAndView modelAndView = new ModelAndView("baseballTeams/index");
		
		List<BaseballTeam> baseballTeamsList = baseballTeamsRepository.findAll();
		
		modelAndView.addObject("baseballTeamsList", baseballTeamsList);
		
		return modelAndView;
	}
	
	@RequestMapping("/baseballTeams/team/{id}")
	public ModelAndView result(@Valid BaseballTeamsForm baseballTeamsForm, BindingResult bindingResult) {
		// エラー時は、indexページにリダイレクト
		if (bindingResult.hasErrors()) {
			return new ModelAndView("redirect:" + "/baseballTeams/");
		}
		
		ModelAndView modelAndView = new ModelAndView("baseballTeams/result");
		
		BaseballTeam baseballTeam = baseballTeamsRepository.findOne(baseballTeamsForm.getId());
		BaseballTeamDto baseballTeamDto = null;
		
		if (baseballTeam != null) {
			baseballTeamDto = new BaseballTeamDto();
			BeanUtils.copyProperties(baseballTeam, baseballTeamDto);
			baseballTeamDto.setHistory(TextUtil.splitByNewLine(baseballTeam.getHistory()));
		}
		
		modelAndView.addObject("baseballTeamDto", baseballTeamDto);
		
		return modelAndView;
	}
}
