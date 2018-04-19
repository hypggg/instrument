package com.hyp.instrument.aopagent;
/**
 *  -javaagent:E:\eclipseWorkspace1\instrument\target\instutil-1.0.jar
 * @author yaping_huang
 *
 */
public class Target {

    public static void main(String[] args) {
      Target t =   new Target();
      System.out.println();
    }

    public void sayHello(){
    	
        System.out.println("Hello, guys!");
    }
}