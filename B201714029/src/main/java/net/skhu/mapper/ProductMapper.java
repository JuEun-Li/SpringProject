package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Product;

@Mapper
public interface ProductMapper {

	@Select(" select p.*, c.title " + " from product p left join category c " + " on p.categoryId = c.id ")
	List<Product> findAll();

	@Select("SELECT * FROM product WHERE id = #{id}")
	Product findOne(int id);

}
