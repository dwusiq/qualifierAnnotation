package com.wusiq.userDefinedQualifier.test;

import com.wusiq.userDefinedQualifier.config.JavaConfig;
import com.wusiq.userDefinedQualifier.qualifier.BlackDog;
import com.wusiq.userDefinedQualifier.qualifier.WhiteDog;
import com.wusiq.userDefinedQualifier.service.DogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    @BlackDog
    public void askBlackDogEat(DogService dogService){
        this.blackDog = dogService;
    }

    @Autowired
    @WhiteDog
    public void askWhiteDogEat(DogService dogService){
        this.whiteDog = dogService;
    }

    @Test
    public void test(){
        whiteDog.eat();
        blackDog.eat();
    }
}
