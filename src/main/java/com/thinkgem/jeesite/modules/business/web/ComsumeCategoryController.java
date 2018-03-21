package com.thinkgem.jeesite.modules.business.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.business.entity.ComsumeCategory;
import com.thinkgem.jeesite.modules.business.service.ComsumeCategoryService;

@Controller
@RequestMapping(value = "${adminPath}/business/comsume")
public class ComsumeCategoryController extends BaseController {
	public static final String path = "modules/business/comsume";

	@Autowired
	private ComsumeCategoryService categoryService;
	
	@RequestMapping(value = { "index" })
	public String index(ComsumeCategory category, Model model) {
		model.addAttribute("list", categoryService.findAllCategory());
		return path+"/categoryIndex";
	}

	@RequestMapping(value = { "add" })
	public String add(ComsumeCategory category, Model model) {
      if(StringUtils.isNotBlank(category.getId())) {
    	   category =categoryService.getComsume(category.getId());
		}
		if (category.getParent()==null||category.getParent().getId()==null){
			category.setParent(new ComsumeCategory("1"));
		}
		category.setParent(categoryService.getComsume(category.getParent().getId()));
		model.addAttribute("category", category);
		return path+"/addCategory";
	}
	
	@RequestMapping(value = "save")
	public String save(ComsumeCategory category, Model model, RedirectAttributes redirectAttributes){
		categoryService.saveCategory(category);
		addMessage(redirectAttributes, "保存商品类别'" + category.getCategoryName() + "'成功");
		return "redirect:" + adminPath + "/business/comsume/index";
	}
	
	@ResponseBody
	@RequestMapping(value = "treeData")
	public List<Map<String, Object>> treeData(@RequestParam(required=false) String extId,@RequestParam(required=false) String isShowHide, HttpServletResponse response) {
		List<Map<String, Object>> mapList = Lists.newArrayList();
		List<ComsumeCategory> list = categoryService.findAllCategory();
		for (int i=0; i<list.size(); i++){
			ComsumeCategory e = list.get(i);
			if (StringUtils.isBlank(extId) || (extId!=null && !extId.equals(e.getId()) && e.getParentids().indexOf(","+extId+",")==-1)){
				if(isShowHide != null && isShowHide.equals("0")){
					continue;
				}
				Map<String, Object> map = Maps.newHashMap();
				map.put("id", e.getId());
				map.put("pId", e.getParentId());
				map.put("name", e.getCategoryName());
				mapList.add(map);
			}
		}
		return mapList;
	}

}
