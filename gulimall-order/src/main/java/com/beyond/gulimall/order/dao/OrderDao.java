package com.beyond.gulimall.order.dao;

import com.beyond.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author 大木
 * @email 210374520@qq.com
 * @date 2021-09-27 17:49:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
