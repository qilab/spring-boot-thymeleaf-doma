package jp.qilab.spring.web.elementary;

import javax.validation.Valid;

import jp.qilab.spring.domain.elementary.Student;
import jp.qilab.spring.form.elementary.Problem05Form;
import jp.qilab.spring.repository.elementary.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Problem05 {

	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping("/elementary/problem05/")
	public ModelAndView index(Problem05Form problem05Form) {
		return new ModelAndView("elementary/problem05/index");
	}
	
	@RequestMapping(value="/elementary/problem05/result", method=RequestMethod.POST)
	public ModelAndView result(
			@Valid Problem05Form problem05Form, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("elementary/problem05/index");
		}
		
		// getOne() を使用した場合、使用したそのときにはクエリは発行されず、
		// そのエンティティを使用したとき（entity.getId() や、画面上で表示するとき）に
		// クエリが発行される。
//		Student student = studentRepository.getOne(problem05Form.getId());
//		if (student != null) {
//			System.out.println("student is not null");
//			try {
//				System.out.println(student.getId());
//			} catch (EntityNotFoundException e) {
//				System.out.println("EntityNotFoundException");
//				student = null;
//			}
//		} else {
//			System.out.println("student is null");
//		}
		
		Student student = studentRepository.findOne(problem05Form.getId());
		
		ModelAndView modelAndView = new ModelAndView("elementary/problem05/result");
		modelAndView.addObject("student", student);
		if (student == null) {
			modelAndView.addObject("id", problem05Form.getId());
		}
		
		return modelAndView;
	}
}
