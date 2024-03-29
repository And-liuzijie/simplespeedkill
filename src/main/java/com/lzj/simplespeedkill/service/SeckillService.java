package com.lzj.simplespeedkill.service;

import com.lzj.simplespeedkill.dto.Exposer;
import com.lzj.simplespeedkill.dto.SeckillExecution;
import com.lzj.simplespeedkill.entity.Seckill;
import com.lzj.simplespeedkill.exception.RepeatKillException;
import com.lzj.simplespeedkill.exception.SeckillCloseException;
import com.lzj.simplespeedkill.exception.SeckillException;

import java.util.List;

/**
 * 业务接口:站在"使用者"角度设计接口
 * 三个方面:方法定义粒度,参数,返回类型(return 类型/异常)
 *
 * Created by wuleshen on 18/12/20.
 */
public interface SeckillService {

    /**
     * 查询所有秒杀记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开启输出秒杀接口地址,
     * 未开启则输出系统时间和秒杀时间
     *
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, String userPhone, String md5)
        throws SeckillException, RepeatKillException, SeckillCloseException;


    /**
     * 执行秒杀操作by 存储过程
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckillProcedure(long seckillId, String userPhone, String md5);

}
