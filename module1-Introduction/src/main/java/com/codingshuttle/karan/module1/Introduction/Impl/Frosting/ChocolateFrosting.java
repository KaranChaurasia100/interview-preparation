package com.codingshuttle.karan.module1.Introduction.Impl.Frosting;

import com.codingshuttle.karan.module1.Introduction.Interfaces.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.type", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting {

    @Override
    public String getFrostingType() {
        return "ChocolateFrosting";
    }
}
