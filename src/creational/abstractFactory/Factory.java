package creational.abstractFactory;

import creational.abstractFactory.exception.UnkownVehicleException;
import creational.abstractFactory.interfaces.Engine;
import creational.abstractFactory.interfaces.Tyre;

public abstract class Factory
{
	// Singleton factory object. 
	private static Factory carFactory = null;
	
	private static Factory truckFactory = null;

	
	public abstract Engine getEngine();
	
	public abstract Tyre getTyre();
	
	
	/**
	 * This is the factory method exposed to the client. Client request for a factory 
	 * instance by passing the type of vehicle. Client does not know about which and how 
	 * object is created internally. \
	 * 
	 */
	public static Factory getInstance(String vehicleType) throws UnkownVehicleException
	{
		if(vehicleType == null)
		{
			return null;
		}
		
		Factory factory = null;
		switch (vehicleType)
		{
		case "car":
			if(null == carFactory)
			{
				carFactory = new CarFactory();
			}
			factory = carFactory;
			break;
		case "truck":
			if(null == truckFactory)
			{
				truckFactory = new TruckFactory();
			}
			factory = truckFactory;
			break;

		default:
			throw new UnkownVehicleException("vehicle type is not known.");
		}
		
		return factory;
	}
}
