package com.blankj.custom.factory;

public interface BenzFactory {
	static Car createCar() {
		return new Benz();
	}
}
