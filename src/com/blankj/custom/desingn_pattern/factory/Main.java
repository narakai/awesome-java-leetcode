package com.blankj.custom.desingn_pattern.factory;

public class Main {
	public static void main(String[] args) {
		Car bmw = BmwFactory.createCar();
		Car benz = BenzFactory.createCar();

		bmw.create();
		benz.create();
	}

}
