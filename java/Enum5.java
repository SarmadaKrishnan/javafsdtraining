package com.ust.examples;
enum WhoisRIR{
	ARIN("whois.arin.net"),
	RIPE("whois.ripe.net"),
	APNIC("whois.apnic.net"),
	LACNIC("whois.lacnic.net"),
	JPNIC("whois.nic.ad.jp"),
	KRNIC("whois.nic.or.kr"),
	CCNIC("ipwhois.cnnic.cn"),
	UNKNOWN("");
	
	private String url;
	WhoisRIR(String url){
		this.url=url;
	}
	public String url()
	{   System.out.println(this.url);
		return url;
	}
}

public class Enum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WhoisRIR r1=WhoisRIR.APNIC;
     r1.url();
     WhoisRIR r2=WhoisRIR.RIPE;
     r2.url();
	}

}
