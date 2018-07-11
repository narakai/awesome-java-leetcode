package com.blankj.custom.desingn_pattern.strategy.example;

@PriceRegion(max = 10000)
public class Orgnic implements CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice;
    }
}
