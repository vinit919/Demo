package com.app.singleton;

public class SingletonJavaClass {
	private static SingletonJavaClass singleton=null;
	
 private SingletonJavaClass()
 {
	 
 }
 
 static
 {
	 singleton= new SingletonJavaClass();
 }
}
