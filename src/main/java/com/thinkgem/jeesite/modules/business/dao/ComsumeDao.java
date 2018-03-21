package com.thinkgem.jeesite.modules.business.dao;

import java.math.BigDecimal;
import java.util.List;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.business.entity.Comsume;
import com.thinkgem.jeesite.modules.business.entity.Trable;

@MyBatisDao
public interface ComsumeDao extends CrudDao<Comsume>{
	public BigDecimal getConsumeSum();
	
   public BigDecimal getIncomeSum();
   
   public List<Trable> findConsumeCategory(String start,String end);
}
