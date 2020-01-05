package creational.abstractFactory.exception;

public class UnkownVehicleException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UnkownVehicleException()
	{
		super();
	}
	
	public UnkownVehicleException(String msg)
	{
		super(msg);
	}

}
