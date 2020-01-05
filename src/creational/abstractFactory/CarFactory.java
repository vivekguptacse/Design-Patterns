package creational.abstractFactory;

import creational.abstractFactory.impl.CarEngine;
import creational.abstractFactory.impl.CarTyre;
import creational.abstractFactory.interfaces.Engine;
import creational.abstractFactory.interfaces.Tyre;

public class CarFactory extends Factory
{

	@Override
	public Engine getEngine()
	{
		return new CarEngine();
	}

	@Override
	public Tyre getTyre()
	{
		return new CarTyre();
	}

}
