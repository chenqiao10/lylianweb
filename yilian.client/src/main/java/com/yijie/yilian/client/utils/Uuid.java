package com.yijie.yilian.client.utils;

import java.util.UUID;

public final class Uuid {
	
	public static String getUuid() {
			//注意replaceAll前面的是正则表达式  
			return UUID.randomUUID().toString().replaceAll("-","");
	}
	
}
