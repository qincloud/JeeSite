package com.thinkgem.jeesite.modules.business.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.business.entity.Product;

@MyBatisDao
public interface ProductDao extends CrudDao<Product>{

}
