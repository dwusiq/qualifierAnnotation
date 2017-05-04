package com.wusiq.userDefinedQualifier.service.impl;

import com.wusiq.userDefinedQualifier.qualifier.BlackDog;
import com.wusiq.userDefinedQualifier.service.DogService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 黑狗
 */
@Component
@BlackDog
public class BlackDogServiceImpl implements DogService {
    @Override
    public void eat() {
        System.out.println("black dog eat something");
    }
}
