package com.codingshuttle.karan.module1.Introduction;

import com.codingshuttle.karan.module1.Introduction.Interfaces.Frosting;
import com.codingshuttle.karan.module1.Introduction.Interfaces.Syrup;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;

    private final Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }


    public void bakeCake()
    {
        System.out.println("Baking Cake with" + " " +frosting.getFrostingType() + " " + syrup.getSyrupType());
    }
}
