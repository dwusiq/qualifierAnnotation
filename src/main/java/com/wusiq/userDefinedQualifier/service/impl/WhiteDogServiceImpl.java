package com.wusiq.userDefinedQualifier.service.impl;

import com.wusiq.userDefinedQualifier.qualifier.WhiteDog;
import com.wusiq.userDefinedQualifier.service.DogService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 白狗
 */
@Component
@WhiteDog
public class WhiteDogServiceImpl implements DogService {
    @Override
    public void eat() {
        System.out.println("white dog eat something");
    }
}
