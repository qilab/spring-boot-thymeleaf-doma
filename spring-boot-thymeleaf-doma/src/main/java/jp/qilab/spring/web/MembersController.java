package jp.qilab.spring.web;

import java.util.List;

import javax.validation.Valid;

import jp.qilab.spring.dao.GroupsDao;
import jp.qilab.spring.dao.MemberDao;
import jp.qilab.spring.domain.Groups;
import jp.qilab.spring.dto.MemberGroupDto;
import jp.qilab.spring.dto.MembersDto;
import jp.qilab.spring.form.MembersSearchForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MembersController {
	
	private final String URL_INDEX = "/members/";
	private final String SRC_INDEX = "members/index";
	private final String URL_SEARCH = "/members/search/";
	
	@Autowired
	GroupsDao groupsDao;
	
	@Autowired
	MemberDao memberDao;

	@RequestMapping(URL_INDEX)
	public ModelAndView index(MembersSearchForm membersSearchForm) {
		ModelAndView modelAndView = new ModelAndView(SRC_INDEX);
		
		List<Groups> groupsList = groupsDao.selectAll();
		modelAndView.addObject("groupsList", groupsList);
		
		return modelAndView;
	}
	
	@RequestMapping(value=URL_SEARCH, method=RequestMethod.POST)
	public ModelAndView search(
			@Valid MembersSearchForm membersSearchForm,
			BindingResult bindingResult) {
		ModelAndView modelAndView = index(membersSearchForm);
		if (bindingResult.hasErrors()) {
			return modelAndView;
		}
		
		List<MemberGroupDto> memberGroupDtoList = 
				memberDao.selectAllWithGroupByNameKanaAndGroupId(
						membersSearchForm.getNameKana(), 
						membersSearchForm.getGroupsId());
		MembersDto membersDto = new MembersDto(memberGroupDtoList);
		modelAndView.addObject("membersDto", membersDto);
		
		return modelAndView;
	}
}












