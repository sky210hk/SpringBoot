package com.coding404.myweb.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.myweb.command.ProductVO;

@Service("productService")
public class productServiceImpl implements ProductService {
	@Autowired
	private ProductMapper productMapper;
	
	
	
	
	@Override
	public int regist(ProductVO vo) {
		// TODO Auto-generated method stub
		return productMapper.regist(vo);
	}

	
}
