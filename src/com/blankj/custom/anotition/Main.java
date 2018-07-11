package com.blankj.custom.anotition;

import java.lang.reflect.Field;


public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		String key = "MAJIAXUEYUAN";

		StringBuffer sb = new StringBuffer();
		sb.append("select ");
		// 反射拿到字节码文件
		Class<?> forName = Class.forName("com.blankj.custom.anotition.User");

		// 拿到成员属性
		Field[] declaredFields = forName.getDeclaredFields();

		// 遍历属性
		for (int i = 0; i < declaredFields.length; i++) {
			// 拿到注解获取name值
			Col col = declaredFields[i].getDeclaredAnnotation(Col.class);
			String name = col.name();
			sb.append(name);
			if (i == declaredFields.length - 1) {
				sb.append(" from ");
			} else {
				sb.append(" , ");
			}
		}
		Table table = forName.getAnnotation(Table.class);
		String name = table.name();
		sb.append(name + " ");
		sb.append(" where user_name = '" + key + "'");
		System.out.println(sb.toString());
		// select user_name,user_age from tb_user;
	}
}
