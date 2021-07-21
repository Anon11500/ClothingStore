package www.dream.com.product.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import www.dream.com.product.model.ProductVO;
import www.dream.com.product.persistence.ProductMapper;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
    @Autowired
    ProductMapper productMapper;
    	
        //LRCUD
        @GetMapping(value="listByProduct")
        public void listPostBySearch(Model model){
            model.addAttribute("productList", productMapper.getList());
        }
        
        
    	@GetMapping(value="registerProduct")
    	public void registerProduct() {
    		
    	}

    	@PostMapping(value="registerProduct")
    	public void registerProduct(ProductVO newProduct) {
    		productMapper.registerProduct(newProduct);
    	}

    	
}