package creational.abstractFactory.impl;

import creational.abstractFactory.interfaces.Tyre;

public class TruckTyre implements Tyre
{

	@Override
	public void design()
	{
		System.out.println("Designing Truck Tyre");

	}

	@Override
	public void manufacturer()
	{
		System.out.println("Manufacturing Truck Tyre");
	}
}
