package com.wusiq.qualifier.service.impl;

import com.wusiq.qualifier.service.DogService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 黑狗
 */
@Component
@Qualifier("blackDog")
public class BlackDogServiceImpl implements DogService{
    @Override
    public void eat() {
        System.out.println("black dog eat something");
    }
}
