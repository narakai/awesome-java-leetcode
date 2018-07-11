package com.blankj.custom.desingn_pattern.factory;

public interface BenzFactory {
	static Car createCar() {
		return new Benz();
	}
}
