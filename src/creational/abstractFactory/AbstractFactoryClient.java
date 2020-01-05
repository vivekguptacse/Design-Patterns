package creational.abstractFactory;

import java.util.Scanner;

import creational.abstractFactory.exception.UnkownVehicleException;
import creational.abstractFactory.interfaces.Engine;
import creational.abstractFactory.interfaces.Tyre;

public class AbstractFactoryClient
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		String vehicleType = in.nextLine().toLowerCase();
		
		// get the factory Instance 
		Factory factory = null;
		
		try
		{
			factory = Factory.getInstance(vehicleType);
			
			// Get the Engine from the factory. 
			Engine engine = factory.getEngine();
			engine.design();
			engine.manufacture();
			engine.test();
			
			// get the tyre from the factory 
			Tyre tyre = factory.getTyre();
			tyre.design();
			tyre.manufacturer();
			
		}
		catch (UnkownVehicleException e) {
			System.out.println("Invalid Vehicle type entered... ");
		}
		in.close();
		
	}

}
