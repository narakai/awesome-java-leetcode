package com.blankj.custom.desingn_pattern.factory;

public interface BmwFactory {
	static Car createCar() {
		return new Bmw();
	}
}
