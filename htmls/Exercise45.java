package com.ust.examples;
class CPU {
	double price;
	class Processor{
		double cores;
		String manufacturer;
		
		double getCache() {
			return 4.3;
		}
	}
	protected class RAM{
		double memory;
		String manufacturer;
		
		double getClockSpeed() {
			return 5.5;
		}
	}
}
public class Exercise45{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CPU cpu=new CPU();
    CPU.Processor processor=cpu.new Processor();
    CPU.RAM ram=cpu.new RAM();
    System.out.println(processor.getCache());
    System.out.println(ram.getClockSpeed());
	}

}
