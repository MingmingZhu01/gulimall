package com.jemmy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jemmy.common.utils.PageUtils;
import com.jemmy.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author jemmyzhu
 * @email jemmyzhu@gmail.com
 * @date 2021-09-10 00:32:40
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

