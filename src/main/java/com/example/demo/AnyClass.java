package com.example.demo;

interface InterfaceWithDefaultAndStaticMethod
{
    void abstractMethod();           //Abstract Method
     
    default void defaultMethod()
    {
        System.out.println("It is a default method");
    }
     
    static void staticMethod()
    {
        System.out.println("It is a static method");
    }
}
 
class AnyClass implements InterfaceWithDefaultAndStaticMethod
{
    @Override
    public void abstractMethod() 
    {
        System.out.println("Abstract Method implemented");
    }
     public static void main(String[] args) {
    	 
    	 InterfaceWithDefaultAndStaticMethod m = new AnyClass()::abstractMethod;
    	 System.out.println(m);
		
	}
    //No need to implement defaultMethod()
     
    //Can't implement staticMethod()
}