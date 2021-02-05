package com.zxs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxs.entity.Storage;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

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
public interface StorageMapper extends BaseMapper<Storage> {

    @Update("UPDATE storage SET used = used + #{count},residue = residue - #{count} WHERE product_id = #{productId}")
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
