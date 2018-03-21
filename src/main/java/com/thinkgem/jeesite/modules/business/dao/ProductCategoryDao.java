package com.thinkgem.jeesite.modules.business.dao;


import java.util.List;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.business.entity.ProductCategory;

/**
 * 商品种类实现
 * @author lzq
 * */
@MyBatisDao
public interface ProductCategoryDao extends CrudDao<ProductCategory> {

}
