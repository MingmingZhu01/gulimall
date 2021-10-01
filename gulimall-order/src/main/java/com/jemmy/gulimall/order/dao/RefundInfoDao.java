package com.jemmy.gulimall.order.dao;

import com.jemmy.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author jemmyzhu
 * @email jemmyzhu@gmail.com
 * @date 2021-09-12 20:03:38
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
