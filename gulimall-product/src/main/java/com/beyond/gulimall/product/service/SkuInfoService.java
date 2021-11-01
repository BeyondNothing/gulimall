package com.beyond.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beyond.common.utils.PageUtils;
import com.beyond.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author 大木
 * @email 210374520@qq.com
 * @date 2021-09-25 20:18:31
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

