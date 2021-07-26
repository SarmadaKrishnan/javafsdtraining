package com.ust.examples;

class Car1{
	String carName;
	String carType;
	
	public Car1(String name,String type)
	{
		this.carName=name;
		this.carType=type;
	}
	
	private String getCarName()
	{
		return this.carName;
	}
	class Engine{
		String engineType;
		void setEngine() {
			if(Car1.this.carType.equals("4wd")) {
				if(Car1.this.getCarName().equals("Crysler")) {
					this.engineType="smaller";
		           }
				else
				{
					this.engineType="bigger";
				}
			}
		}
			String getEngineType() {
				return this.engineType;
				
			}
		}
	}
	


public class Exercise46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car1=new Car1("MAZDA","8WD");
		Car1.Engine engine=car1.new Engine();
		engine.setEngine();
		System.out.println(engine.getEngineType());
		Car1 car2=new Car1("crysteler","4wd");
		Car1.Engine c2engine=car2.new Engine();
		c2engine.setEngine();
		System.out.println(c2engine.getEngineType());

	}

}
