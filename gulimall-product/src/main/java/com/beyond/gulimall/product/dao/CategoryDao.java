package com.beyond.gulimall.product.dao;

import com.beyond.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author 大木
 * @email 210374520@qq.com
 * @date 2021-09-25 20:18:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
