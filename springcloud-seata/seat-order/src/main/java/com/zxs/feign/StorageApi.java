package com.zxs.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Package：com.warape.seatstorage.filter
 * @Table
 * @Description:
 * @Author：ZhangXuSheng
 * @QQ：a15873194117@163.com
 * @Date： 2021/2/5
 * @Version V1.0
 */
@FeignClient(value = "seat-storage")
public interface StorageApi {

    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @GetMapping("/storage/decrease")
    public String decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
