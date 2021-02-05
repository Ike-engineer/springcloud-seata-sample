package com.zxs;

import com.zxs.feign.StorageApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Package：com.warape.seatorder
 * @Table
 * @Description:
 * @Author：ZhangXuSheng
 * @QQ：a15873194117@163.com
 * @Date： 2021/2/5
 * @Version V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SeatOrderTest {


    @Autowired
    StorageApi storageApi;

    @Test
    public void test(){
        storageApi.decrease(1L,2);
    }
}
