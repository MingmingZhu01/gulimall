package com.jemmy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jemmy.common.utils.PageUtils;
import com.jemmy.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author jemmyzhu
 * @email jemmyzhu@gmail.com
 * @date 2021-09-10 00:32:40
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

