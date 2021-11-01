package com.beyond.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beyond.common.utils.PageUtils;
import com.beyond.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author 大木
 * @email 210374520@qq.com
 * @date 2021-09-27 17:45:49
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

