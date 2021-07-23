package com.ust.examples;

public class Collections12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubClass
		GenericsClass<Integer> intObj=new GenericsClass<>(5);
		System.out.println("Generic Class returns:"+intObj.getData());
		GenericsClass<String> stringObj=new GenericsClass<>("JAVA PROGRAMMING");
		System.out.println("Generics Class returns:"+stringObj.getData());

	}

}
class GenericsClass<T>{
	private T data;
	public GenericsClass(T data)
	{
		this.data=data;
	}
public T getData() {
	return this.data;
}}

