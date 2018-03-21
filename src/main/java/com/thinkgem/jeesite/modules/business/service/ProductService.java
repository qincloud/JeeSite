package com.thinkgem.jeesite.modules.business.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.business.dao.ProductDao;
import com.thinkgem.jeesite.modules.business.entity.Product;

@Service
@Transactional(readOnly = true)
public class ProductService  extends CrudService<ProductDao,Product>{

}
