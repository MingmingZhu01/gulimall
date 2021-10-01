package com.jemmy.gulimall.member.dao;

import com.jemmy.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author jemmyzhu
 * @email jemmyzhu@gmail.com
 * @date 2021-09-12 19:57:15
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
