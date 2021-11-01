package com.beyond.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beyond.common.utils.PageUtils;
import com.beyond.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author 大木
 * @email 210374520@qq.com
 * @date 2021-09-27 17:41:25
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

