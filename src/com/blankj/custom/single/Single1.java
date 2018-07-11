package com.blankj.custom.single;

// 懒汉式（线程安全问题）
public class Single1 {
	private static Single1 instance;

	private Single1() {
		System.out.println("构造函数运行-----");
	}

	public static Single1 getInstance() {
		if (instance == null) {
			instance = new Single1();
		}
		return instance;
	}

	public static void main(String[] args) {
		Single1 instance = Single1.getInstance();
		Single1 instance2 = Single1.getInstance();
		System.out.println(instance == instance2);
	}
}
