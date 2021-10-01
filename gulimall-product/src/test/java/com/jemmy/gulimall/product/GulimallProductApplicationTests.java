package com.jemmy.gulimall.product;

import com.jemmy.gulimall.product.dao.BrandDao;
import com.jemmy.gulimall.product.entity.BrandEntity;
import com.jemmy.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandDao brandDao;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("小米");
        brandService.save(brandEntity);
        BrandEntity brandEntity1 = new BrandEntity();
        brandEntity1.setName("苹果");
        brandDao.insert(brandEntity1);
    }

}
