package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.dto.Category;
import net.skhu.dto.Department;
import net.skhu.dto.Product;
import net.skhu.mapper.CategoryMapper;
import net.skhu.mapper.ProductMapper;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductMapper productMapper;
	@Autowired
	CategoryMapper categoryMapper;

	@RequestMapping("list")
	public String list(Model model) {
		List<Product> products = productMapper.findAll();
		model.addAttribute("products", products);
		return "product/list";
	}

    @GetMapping("edit")
    public String edit(Model model, int id) {
        List<Category> categoryList = categoryMapper.findAll();
        model.addAttribute("categoryList", categoryList);
        Product product = productMapper.findOne(id);
        model.addAttribute("product", product);
        return "product/edit";
    }

    @RequestMapping("delete")
    public String delete(Model model, @RequestParam("id") int id) {
//    	productMapper.delete(id);
        return "redirect:list";
    }
}