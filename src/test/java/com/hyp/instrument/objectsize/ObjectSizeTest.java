package com.hyp.instrument.objectsize;

import java.util.ArrayList;

/**
 * 先用mvn build 生成 jar包
 *  vm args -javaagent:E:\eclipseWorkspace1\instrument\target\instutil-1.0.jar
 */
public class ObjectSizeTest {
	
	public static void main(String[] args) {
		System.out.println(SizeOfObject.sizeOf(new Object()));
		System.out.println(SizeOfObject.sizeOf(new FourFileld()));
		System.out.println(SizeOfObject.sizeOf(new TwoField()));
		System.out.println(SizeOfObject.sizeOf(new ArrayList<>()));
	}
}	
