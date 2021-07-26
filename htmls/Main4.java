package com.ust.examples;
abstract interface MusicPlayer{
	public static final int defaultVolume=30;
	public abstract void play(String s);
	public abstract void stop(String s);
}
 class VLC implements MusicPlayer{
	public void play(String s)
	{
	 if(s=="melody"||(s=="dance"))
	 {
		 System.out.println("play");
	 }
	 else
	 {
		 System.out.println("stop");
	 }
	}
public void stop(String s)
{
	if(s=="jazz") {
		System.out.println("stop");
	}
	else
	{
		System.out.println("play");
	}
}}
public class Main4{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   VLC n=new VLC();
   n.play("melody");
   n.stop("jazz");
	}
}
