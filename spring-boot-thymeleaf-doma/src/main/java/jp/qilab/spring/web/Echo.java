package jp.qilab.spring.web;

import javax.validation.Valid;

import jp.qilab.spring.form.elementary.EchoForm;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Echo {

	@RequestMapping("/echo/")
	public ModelAndView index(EchoForm echoForm) {
		ModelAndView modelAndView = new ModelAndView("elementary/problem01/index");
		return modelAndView;
	}
	
	@RequestMapping(value="/echo/result", method=RequestMethod.POST)
	public ModelAndView result(@Valid EchoForm echoForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("elementary/problem01/index");
		}
		ModelAndView modelAndView = new ModelAndView("elementary/problem01/result");
		modelAndView.addObject("person", echoForm);
		return modelAndView;
	}
}
