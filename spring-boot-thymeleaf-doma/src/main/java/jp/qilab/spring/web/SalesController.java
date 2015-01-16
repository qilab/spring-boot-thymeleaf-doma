package jp.qilab.spring.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import jp.qilab.spring.dao.SalesDao;
import jp.qilab.spring.dto.PurchasedItemDto;
import jp.qilab.spring.dto.SalesDto;
import jp.qilab.spring.dto.resultset.SalesWithItemResultSet;
import jp.qilab.spring.form.SalesForm;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SalesController {

	private final String URL_INDEX = "/sales/";
	private final String SRC_INDEX = "sales/index";
	private final String URL_DETAIL = URL_INDEX + "detail/{salesDetailId}";
	private final String SRC_DETAIL = "sales/detail";
	
	@Autowired
	SalesDao salesDao;
	
	@RequestMapping(value = URL_INDEX)
	public ModelAndView index(SalesForm form) {
		ModelAndView modelAndView = new ModelAndView(SRC_INDEX);
		
		List<SalesWithItemResultSet> rsList = salesDao.findWithItemById(form.getSalesDetailId());
		
		List<SalesDto> salesDtoList = null;
		if (rsList != null && rsList.size() != 0) {
			// 結果が返ってこなかった場合は、 salesDtoList は null
			salesDtoList = new ArrayList<SalesDto>();
			Map<Integer, SalesDto> map = new HashMap<>();
			for (SalesWithItemResultSet rs : rsList) {
				if (!map.containsKey(rs.getId())) {
					SalesDto salesDto = new SalesDto(rs);
					salesDto.setPurchasedItemDtoList(new ArrayList<PurchasedItemDto>());
					salesDto.setGrossSale(0);
					map.put(rs.getId(), salesDto);
				}
				SalesDto salesDto = map.get(rs.getId());
				PurchasedItemDto pid = new PurchasedItemDto();
				BeanUtils.copyProperties(rs, pid);
				pid.setName(rs.getItemName());
				// add gross sale 
				salesDto.addGrossSale(rs.getPrice() * rs.getQuantity());
				
				salesDto.getPurchasedItemDtoList().add(pid);
			}
			for (Map.Entry<Integer, SalesDto> e : map.entrySet()) {
				salesDtoList.add(e.getValue());
			}
		}
		modelAndView.addObject("salesDtoList", salesDtoList);
		int numberOfSales = 0;
		if (salesDtoList != null) {
			numberOfSales = salesDtoList.size();
		}
		modelAndView.addObject("numberOfSales", numberOfSales);
		
		return modelAndView;
	}
	
	@RequestMapping(value = URL_DETAIL)
	public ModelAndView detail(
			@Valid SalesForm form,
			BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView(SRC_DETAIL);
		
		// form error
		if (bindingResult.hasErrors()) {
			//
		}
		
		List<SalesWithItemResultSet> rsList = salesDao.findWithItemById(form.getSalesDetailId());
		
		// not found error
		if (rsList == null || rsList.size() == 0) {
			//
		}
		

		SalesDto salesDto = new SalesDto(rsList.get(0));
		salesDto.setPurchasedItemDtoList(new ArrayList<PurchasedItemDto>());
		salesDto.setGrossSale(0);
		for (SalesWithItemResultSet rs : rsList) {
			PurchasedItemDto pid = new PurchasedItemDto();
			BeanUtils.copyProperties(rs, pid);
			pid.setName(rs.getItemName());
			// add gross sale 
			salesDto.addGrossSale(rs.getPrice() * rs.getQuantity());
			
			salesDto.getPurchasedItemDtoList().add(pid);
		}
	
		modelAndView.addObject("salesDto", salesDto);
		
		return modelAndView;
	}
}
