package com.app.singleton;

public class SingletonJavaClass {
	private static SingletonJavaClass singleton=null;
	
 private SingletonJavaClass()
 {
	 
 }
 //static block for singleton class initialization
 static
 {
	 singleton= new SingletonJavaClass();
 }
 
 
 
 
 
 
 
 
 
}
