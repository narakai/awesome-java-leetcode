package com.blankj.custom.factory;

public interface BmwFactory {
	static Car createCar() {
		return new Bmw();
	}
}
