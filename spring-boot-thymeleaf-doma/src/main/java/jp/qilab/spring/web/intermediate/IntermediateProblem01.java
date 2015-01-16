package jp.qilab.spring.web.intermediate;

import java.util.List;

import javax.validation.Valid;

import jp.qilab.spring.domain.intermediate.BaseballTeam;
import jp.qilab.spring.dto.BaseballTeamDto;
import jp.qilab.spring.form.intermediate.Problem01Form;
import jp.qilab.spring.repository.intermediate.BaseballTeamsRepository;
import jp.qilab.spring.utils.TextUtil;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IntermediateProblem01 {

	@Autowired
	BaseballTeamsRepository baseballTeamsRepository;
	
	@RequestMapping("/intermediate/problem01/")
	public ModelAndView index(Problem01Form problem01From) {
		ModelAndView modelAndView = new ModelAndView("intermediate/problem01/index");
		
		List<BaseballTeam> baseballTeamsList = baseballTeamsRepository.findAll();
		
		modelAndView.addObject("baseballTeamsList", baseballTeamsList);
		
		return modelAndView;
	}
	
	@RequestMapping("/intermediate/problem01/result/{id}")
	public ModelAndView result(@Valid Problem01Form problem01Form, BindingResult bindingResult) {
		// エラー時は、indexページにリダイレクト
		if (bindingResult.hasErrors()) {
			return new ModelAndView("redirect:" + "/intermediate/problem01/");
		}
		
		ModelAndView modelAndView = new ModelAndView("intermediate/problem01/result");
		
		BaseballTeam baseballTeam = baseballTeamsRepository.findOne(problem01Form.getId());
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
