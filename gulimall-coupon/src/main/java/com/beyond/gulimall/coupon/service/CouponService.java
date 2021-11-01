package com.beyond.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beyond.common.utils.PageUtils;
import com.beyond.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author 大木
 * @email 210374520@qq.com
 * @date 2021-09-27 17:41:23
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
