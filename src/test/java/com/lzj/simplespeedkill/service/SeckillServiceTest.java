package com.lzj.simplespeedkill.service;

import com.lzj.simplespeedkill.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
public class SeckillServiceTest {

    @Autowired
    private SeckillService seckillService;
    @Test
    public void getSeckillList() {
        List<Seckill> seckillList=seckillService.getSeckillList();
        System.out.println(seckillList);
    }
}