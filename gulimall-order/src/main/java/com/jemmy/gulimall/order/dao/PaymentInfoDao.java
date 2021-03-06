package com.jemmy.gulimall.order.dao;

import com.jemmy.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author jemmyzhu
 * @email jemmyzhu@gmail.com
 * @date 2021-09-12 20:03:38
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
