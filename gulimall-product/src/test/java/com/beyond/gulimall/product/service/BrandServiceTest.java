package com.beyond.gulimall.product.service;


import com.beyond.gulimall.product.entity.BrandEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: 大木
 * @date: 2021/9/26 3:31 下午
 */
@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class BrandServiceTest {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        log.info("插入成功。。。。");
    }

}