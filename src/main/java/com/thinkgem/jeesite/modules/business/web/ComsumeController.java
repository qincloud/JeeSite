package com.thinkgem.jeesite.modules.business.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.business.entity.Comsume;
import com.thinkgem.jeesite.modules.business.service.ComsumeCategoryService;
import com.thinkgem.jeesite.modules.business.service.ComsumeService;
import com.thinkgem.jeesite.modules.business.utils.DateUtils;
import com.thinkgem.jeesite.modules.cms.entity.Article;

/**
 * 消費controller
 */
@Controller
@RequestMapping(value = "${adminPath}/business/comsume/mx")
public class ComsumeController extends BaseController {
	public static final String path = "modules/business/comsume";

	@Autowired
	private ComsumeService service;
	
	@Autowired
	private ComsumeCategoryService category;
	
	@RequestMapping(value = { "index" })
	public String index(Comsume comsume, Model model) {
		model.addAttribute("list", service.findAllComsume());
		return path + "/comsume_index";
	}

	@RequestMapping(value = { "list" })
	public String list(Comsume comsume, HttpServletRequest request, HttpServletResponse response, Model model) {
		 Page<Comsume> page = service.findPage(new Page<Comsume>(request, response), comsume); 
	    model.addAttribute("page", page);
		return path + "/comsume_list";
	}
	
	@RequiresPermissions("business:mx:edit")
	@RequestMapping(value = { "add" })
	public String add(Comsume comsume,Model model) {
		if(StringUtils.isNotBlank(comsume.getId())) {
			comsume = service.getComsume(comsume.getId());
		}

		model.addAttribute("comsume", comsume);
		return path + "/comsume_add";
	}
	
	@RequestMapping(value = "tree")
	public String tree(Model model) {
		model.addAttribute("categorys",category.findAllCategory());
		return path+"/tree";
	}
	
	@RequiresPermissions("business:mx:edit")
	@RequestMapping(value = "save")
	public String save(Comsume comsume, Model model, RedirectAttributes redirectAttributes){
		String category = comsume.getCategory();
		String code = comsume.getCode();
		service.saveComsume(comsume);
		redirectAttributes.addAttribute("category",category);
		redirectAttributes.addAttribute("code",code);
		addMessage(redirectAttributes, "保存成功");
		model.addAttribute("comsume", comsume);
		return "redirect:" + adminPath + "/business/comsume/mx/list";
	}

	@RequestMapping(value = "delete")
	public String delete(Comsume comsume,Model model, RedirectAttributes redirectAttributes) {
		comsume = service.getComsume(comsume.getId());
		String category = comsume.getCategory();
		String code = comsume.getCode();
		service.deleteComsume(comsume);
		redirectAttributes.addAttribute("category",category);
		redirectAttributes.addAttribute("code",code);
		addMessage(redirectAttributes, "删除成功");
		model.addAttribute("comsume", comsume);
		return "redirect:" + adminPath + "/business/comsume/mx/list";
	}
	
	@RequestMapping(value = "echarts")
	public String echarts(Model model) {
		model.addAttribute("consume",service.getConsumeSum());
		model.addAttribute("income",service.getIncomeSum());
		model.addAttribute("over", service.getIncomeSum().subtract(service.getConsumeSum()));
		return path + "/comsume_echarts";
	}
	
	@ResponseBody
	@RequestMapping(value = "categoryNum")
	public Object categoryNum() {
		return service.findComsumCategory(DateUtils.getMonthFirstDay(),DateUtils.getMonthLastDay());
	}
}
