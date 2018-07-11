package com.blankj.custom.single;

/**
 * 码家学院
 * 
 * @author Liao 单例模式，饿汉式
 */
public class Single3 {

	private static Single3 instance = new Single3();

	private Single3() {
		System.out.println("构造函数--");
	}

	public static Single3 getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		Single3 instance1 = Single3.getInstance();
		Single3 instance2 = Single3.getInstance();
		System.out.println("333:" + (instance1 == instance2));
	}
}
