package creational.abstractFactory.impl;

import creational.abstractFactory.interfaces.Engine;

public class TruckEngine implements Engine
{

	@Override
	public void design()
	{
		System.out.println("Designing Truck Engine");

	}

	@Override
	public void manufacture()
	{
		System.out.println("manufacturing Truck Engine");
	}

	@Override
	public void test()
	{
		System.out.println("Testing Truck Engine");
	}


}
