package com.jemmy.gulimall.member.feign;

import com.jemmy.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface TestFeignService {

    @RequestMapping("/coupon/spubounds/member/list")
    public R testMemberCoupon();
}
