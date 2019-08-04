package com.lzj.simplespeedkill.dao;


import com.lzj.simplespeedkill.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


/**
 * Created by wuleshen on 18/12/6.
 */
@Component
public interface SuccessKilledDao {

    /**
     * 插入购买明细,可过滤重复
     *
     * @param seckillId
     * @param userPhone
     * @return 插入的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") String userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     *
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") String userPhone);

}
