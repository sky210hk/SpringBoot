package com.coding404.myweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.product.ProductService;

@Controller
@RequestMapping("/product")
public class ProducetController {
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	
	@GetMapping("productReg")
	public String pruductReg() {
		
		return "product/productReg";
	}
	@GetMapping("productList")
	public String productList() {
		return "product/productList";
	}
	@GetMapping("productDetail")
	public String productDetail() {
		
		return "product/productDetail";
	}
	//상품등록폼
	@PostMapping("productForm")
	public String productForm(ProductVO vo, Model model, Errors erros,RedirectAttributes RA) {
		
		//메시지 출력문
		
		int result = productService.regist(vo);
		if(result ==1) {
			RA.addFlashAttribute("msg", vo.getProd_name()+"이 정상등록되었습니다.");
		}else {
			RA.addFlashAttribute("msg","등록실패, 관리자에게 문의하세요");
			
		}
		
		
		return "redirect:/product/productList";//등록이후 목록화면으로
	}
}
