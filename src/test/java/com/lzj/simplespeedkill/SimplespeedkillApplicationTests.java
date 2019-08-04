package com.lzj.simplespeedkill;

import com.lzj.simplespeedkill.entity.Seckill;
import com.lzj.simplespeedkill.service.impl.SeckillServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimplespeedkillApplicationTests {

    @Test
    public void contextLoads() {
        SeckillServiceImpl service=new SeckillServiceImpl();


}
