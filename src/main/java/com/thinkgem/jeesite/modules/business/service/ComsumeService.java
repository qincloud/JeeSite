package com.thinkgem.jeesite.modules.business.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.business.dao.ComsumeCategoryDao;
import com.thinkgem.jeesite.modules.business.dao.ComsumeDao;
import com.thinkgem.jeesite.modules.business.dao.ProductCategoryDao;
import com.thinkgem.jeesite.modules.business.entity.Comsume;
import com.thinkgem.jeesite.modules.business.entity.ComsumeCategory;
import com.thinkgem.jeesite.modules.business.entity.ProductCategory;
import com.thinkgem.jeesite.modules.sys.entity.Menu;

@Service
@Transactional(readOnly = true)
public class ComsumeService extends CrudService<ComsumeDao, Comsume> {

	@Transactional(readOnly = false)
	public Page<Comsume> findPage(Page<Comsume> page,Comsume comsume){
		return super.findPage(page, comsume);
	}
	@Transactional(readOnly = false)
	public void saveComsume(Comsume category) {
		if (StringUtils.isBlank(category.getId())) {
			category.preInsert();
			dao.insert(category);
		} else {
			category.preUpdate();
			dao.update(category);
		}
	}

	public Comsume getComsume(String id) {
		return dao.get(id);
	}

	public List<Comsume> findAllComsume() {
		return dao.findAllList();
	}
	
	@Transactional(readOnly = false)
	public void deleteComsume(Comsume comsume) {
		dao.delete(comsume);
	}
	
	@Transactional(readOnly = false)
	public BigDecimal getConsumeSum() {
		return dao.getConsumeSum();
	}
	
	@Transactional(readOnly = false)
	public BigDecimal getIncomeSum() {
		return dao.getIncomeSum();
	}
	
	@Transactional(readOnly = false)
	public Object findComsumCategory(String start,String end) {
		return dao.findConsumeCategory(start,end);
	}
}
