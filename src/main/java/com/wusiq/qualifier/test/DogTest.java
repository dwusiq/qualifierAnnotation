package com.wusiq.qualifier.test;

import com.wusiq.qualifier.config.JavaConfig;
import com.wusiq.qualifier.service.DogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试qualifier注解
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class DogTest {
    DogService whiteDog = null;
    DogService blackDog = null;

    @Autowired
    @Qualifier("blackDog")
    public void askBlackDogEat(DogService dogService){
        this.blackDog = dogService;
    }

    @Autowired
    @Qualifier("whiteDog")
    public void askWhiteDogEat(DogService dogService){
        this.whiteDog = dogService;
    }

    @Test
    public void test(){
        whiteDog.eat();
        blackDog.eat();
    }
}
