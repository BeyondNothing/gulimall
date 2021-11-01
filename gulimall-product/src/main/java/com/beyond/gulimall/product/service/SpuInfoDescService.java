package com.beyond.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beyond.common.utils.PageUtils;
import com.beyond.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author 大木
 * @email 210374520@qq.com
 * @date 2021-09-25 20:18:32
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

