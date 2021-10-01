package com.jemmy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jemmy.common.utils.PageUtils;
import com.jemmy.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author jemmyzhu
 * @email jemmyzhu@gmail.com
 * @date 2021-09-10 00:32:40
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

