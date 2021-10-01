package com.jemmy.gulimall.coupon.dao;

import com.jemmy.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author jemmyzhu
 * @email jemmyzhu@gmail.com
 * @date 2021-09-12 19:49:45
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
