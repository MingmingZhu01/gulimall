package com.jemmy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jemmy.common.utils.PageUtils;
import com.jemmy.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author jemmyzhu
 * @email jemmyzhu@gmail.com
 * @date 2021-09-12 20:03:38
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

