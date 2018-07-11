package com.blankj.custom.desingn_pattern.single;

// 懒汉式（）
public class Single2 {
	private static Single2 instance;

	private Single2() {
		System.out.println("Single2构造函数运行-----");
	}

	public static synchronized Single2 getInstance() {
		if (instance == null) {
			instance = new Single2();
		}
		return instance;
	}

	public static void main(String[] args) {
		Single2 instance = Single2.getInstance();
		Single2 instance2 = Single2.getInstance();
		System.out.println("222:" + (instance == instance2));
	}
}
