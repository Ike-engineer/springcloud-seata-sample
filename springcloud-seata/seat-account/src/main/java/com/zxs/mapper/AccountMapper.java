package com.zxs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxs.entity.Account;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @Package：com.warape.seatstorage.filter
 * @Table
 * @Description:
 * @Author：ZhangXuSheng
 * @QQ：a15873194117@163.com
 * @Date： 2021/2/5
 * @Version V1.0
 */
@Repository
public interface AccountMapper extends BaseMapper<Account> {

    @Update("UPDATE account SET residue = residue - #{money},used = used + #{money} where user_id = #{userId};")
    void decrease(Long userId, BigDecimal money);
}
