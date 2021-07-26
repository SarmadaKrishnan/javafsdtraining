package com.ust.examples;

public class Example31 {
	private String formatNumbers(int value)
	{
		return String.format("%d",value);
	}
    private String formatNumbers(double value)
    {
    	return String.format("%.5f", value);
    }
    private String formatNumbers(String value)
    {
    	return String.format("%.2f", Double.parseDouble(value));
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example31 hs=new Example31();
		System.out.println(hs.formatNumbers(500));
		System.out.println(hs.formatNumbers(89.994));
		System.out.println(hs.formatNumbers("550"));

	}

}
