package creational.abstractFactory;

import creational.abstractFactory.impl.TruckEngine;
import creational.abstractFactory.impl.TruckTyre;
import creational.abstractFactory.interfaces.Engine;
import creational.abstractFactory.interfaces.Tyre;

public class TruckFactory extends Factory
{

	@Override
	public Engine getEngine()
	{
		return new TruckEngine();
	}

	@Override
	public Tyre getTyre()
	{
		return new TruckTyre();
	}

}
