package creational.abstractFactory.impl;

import creational.abstractFactory.interfaces.Tyre;

public class CarTyre implements Tyre
{

	@Override
	public void design()
	{
		System.out.println("Designing Car Tyre");

	}

	@Override
	public void manufacturer()
	{
		System.out.println("Manufacturing Car Tyre");
	}

}
