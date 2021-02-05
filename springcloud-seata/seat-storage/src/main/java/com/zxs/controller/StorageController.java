package com.zxs.controller;


import com.zxs.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package：com.warape.seatstorage.filter
 * @Table
 * @Description:
 * @Author：ZhangXuSheng
 * @QQ：a15873194117@163.com
 * @Date： 2021/2/5
 * @Version V1.0
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    @Qualifier("storageServiceImpl")
    private StorageService storageServiceImpl;

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    @GetMapping("/decrease")
    public String decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count){
        storageServiceImpl.decrease(productId,count);
        return "Decrease storage success";
    }
}
