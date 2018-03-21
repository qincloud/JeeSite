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
import com.thinkgem.jeesite.modules.business.entity.Product;
import com.thinkgem.jeesite.modules.business.entity.ProductCategory;
import com.thinkgem.jeesite.modules.business.service.ProductCategoryService;
import com.thinkgem.jeesite.modules.sys.entity.Menu;
import com.thinkgem.jeesite.modules.sys.entity.User;

@Controller
@RequestMapping(value = "${adminPath}/business/category")
public class ProductCategoryController extends BaseController {

	@Autowired
	private ProductCategoryService categoryService;

	@RequestMapping(value = { "index" })
	public String index(ProductCategory category, Model model) {
		model.addAttribute("list", categoryService.findAllCategory());
		return "modules/business/categoryIndex";
	}

	@RequestMapping(value = { "add" })
	public String add(ProductCategory category, Model model) {
      if(StringUtils.isNotBlank(category.getId())) {
    	   category =categoryService.getCategory(category.getId());
		}
		if (category.getParent()==null||category.getParent().getId()==null){
			category.setParent(new ProductCategory("1"));
		}
		category.setParent(categoryService.getCategory(category.getParent().getId()));
		model.addAttribute("category", category);
		return "modules/business/addCategory";
	}
	
	@RequestMapping(value = "save")
	public String save(ProductCategory category, Model model, RedirectAttributes redirectAttributes){
		categoryService.saveCategory(category);
		addMessage(redirectAttributes, "保存商品类别'" + category.getCategoryName() + "'成功");
		return "redirect:" + adminPath + "/business/category/index";
	}
	
	@ResponseBody
	@RequestMapping(value = "treeData")
	public List<Map<String, Object>> treeData(@RequestParam(required=false) String extId,@RequestParam(required=false) String isShowHide, HttpServletResponse response) {
		List<Map<String, Object>> mapList = Lists.newArrayList();
		List<ProductCategory> list = categoryService.findAllCategory();
		for (int i=0; i<list.size(); i++){
			ProductCategory e = list.get(i);
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
