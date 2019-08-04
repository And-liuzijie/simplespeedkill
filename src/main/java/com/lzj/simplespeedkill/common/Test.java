package com.lzj.simplespeedkill.common;

import com.lzj.simplespeedkill.entity.Seckill;
import com.lzj.simplespeedkill.service.SeckillService;
import com.lzj.simplespeedkill.service.impl.SeckillServiceImpl;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SeckillService seckillService=new SeckillServiceImpl();
        List<Seckill> list=seckillService.getSeckillList();
        System.out.println(list);
    }
}
