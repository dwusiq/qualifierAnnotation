package com.wusiq.qualifier.service.impl;

import com.wusiq.qualifier.service.DogService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 白狗
 */
@Component
@Qualifier("whiteDog")
public class WhiteDogServiceImpl implements DogService{
    @Override
    public void eat() {
        System.out.println("white dog eat something");
    }
}
