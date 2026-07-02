package com.codingshuttle.karan.module1.Introduction.Impl.Syrup;

import com.codingshuttle.karan.module1.Introduction.Interfaces.Syrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup {

    @Override
    public String getSyrupType() {
        return "ChocolateSyrup";
    }
}
