package com.jemmy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jemmy.common.utils.PageUtils;
import com.jemmy.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author jemmyzhu
 * @email jemmyzhu@gmail.com
 * @date 2021-09-12 19:49:45
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

