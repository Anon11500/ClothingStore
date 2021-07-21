package www.dream.com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.dream.com.product.model.ProductVO;
import www.dream.com.product.persistence.ProductMapper;

@Service
public class productService  {
	
	@Autowired
	ProductMapper productMapper;
	
	//회원가입
	public int registerProduct(ProductVO product) {
		return productMapper.registerProduct(product);
	}
	
}
