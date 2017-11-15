package com.aa.util;

public class KeyUtil {
	public static String getKey(String methodName, Object[] args) {
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		buffer.append(methodName).append("(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				buffer.append(args[i]);
				continue;
			}
			buffer.append(",").append(args[i]);
		}
		buffer.append(")");

		return buffer.toString();
	}
}
