package com.blankj.custom.desingn_pattern.strategy.example;

@PriceRegion(max=20000)
public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice  * 0.9;
    }
}
