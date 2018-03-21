package com.thinkgem.jeesite.modules.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.business.dao.ProductCategoryDao;
import com.thinkgem.jeesite.modules.business.entity.ProductCategory;

@Service
@Transactional(readOnly = true)
public class ProductCategoryService extends CrudService<ProductCategoryDao, ProductCategory> {

	@Transactional(readOnly = false)
	public void saveCategory(ProductCategory category) {
		category.setParent(getCategory(category.getParent().getId()));
		String oldParentIds = category.getParentids();
		category.setParentids(category.getParent().getParentids() +","+ category.getParent().getId());
		if (StringUtils.isBlank(category.getId())) {
			category.preInsert();
			dao.insert(category);
		} else {
			category.preUpdate();
			dao.update(category);
		}
	}

	public ProductCategory getCategory(String id) {
		return dao.get(id);
	}

	public List<ProductCategory> findAllCategory() {
		return dao.findAllList();
	}
}
