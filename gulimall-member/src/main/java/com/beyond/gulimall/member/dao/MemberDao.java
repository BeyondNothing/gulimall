package com.beyond.gulimall.member.dao;

import com.beyond.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author 大木
 * @email 210374520@qq.com
 * @date 2021-09-27 17:45:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
