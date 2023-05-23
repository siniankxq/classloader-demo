package com.ypc.classloader;

/**
 * @author xun (siniankxq@163.com)
 * @version 1.0.0
 * @ClassName LoaderInterface.java
 * @Description
 * @createTime 2023年05月23日 21:22:00
 */
public class DefaultLoaderInterface implements LoaderInterface {


	@Override
	public String load(String name) {
		System.out.println("测试123================");
		return "test333333333333";
	}
}
