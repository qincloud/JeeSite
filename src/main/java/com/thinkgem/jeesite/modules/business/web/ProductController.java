package com.thinkgem.jeesite.modules.business.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.business.entity.Product;
import com.thinkgem.jeesite.modules.business.entity.ProductCategory;

@Controller
@RequestMapping(value = "${adminPath}/business/product")
public class ProductController extends BaseController  {
	
	@RequestMapping(value = {"index"})
	public String index(ProductCategory category, Model model) {
		return "modules/business/product_index";
	}
	
	@RequestMapping(value = {"add"})
	public String add(Product product,Model model) {
		model.addAttribute("product",product);
		return "modules/business/product_form";
	}
}
