package com.malbright;

public class Sail {
	
	private boolean wind;
	private int windSpeed;
	private String boatName;
	private int maxSpeed;
	private double lOA;
	private int sailorsPresent;
	private int sailorsToCrew;
	private int maxWindToSail;
	private int minWindToSail;
//	private boolean luffing;
	
//	private String comeAbout;
//	private String jibe;
//	private String tightenDown;
//	private String loosenUp;
	
	
	public boolean isWind() 
	{
		return wind;
	}
	
	public void setWind(boolean wind) 
	{
		this.wind = wind;
	}
	
	public int getWindSpeed() 
	{
		return windSpeed;
	}
	
	public void setWindSpeed(int windSpeed) 
	{
		this.windSpeed = windSpeed;
	}
	
	public String getBoatName()
	{
		return boatName;
	}
	
	public void setBoatName(String boatName)
	{
		this.boatName = boatName;
	}
	
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
	
	public double getLOA()
	{
		return lOA;
	}
	
	public void setLOA(double lOA)
	{
		this.lOA = lOA;
	}
	
	public int getSailorsPresent()
	{
		return sailorsPresent;
	}
	
	public void setSailorsPresent(int sailorsPresent)
	{
		this.sailorsPresent = sailorsPresent;
	}
	public int getSailorsToCrew()
	{
		return sailorsToCrew;
	}
	
	public void setSailorsToCrew(int sailorsToCrew)
	{
		this.sailorsToCrew = sailorsToCrew;
	}
	
	public int getMaxWindToSail()
	{
		return maxWindToSail;
	}
	
	public void setMaxWindToSail(int maxWindToSail)
	{
		this.maxWindToSail = maxWindToSail;
	}
	
	public int getMinWindToSail()
	{
		return minWindToSail;
	}
	
	public void setMinWindToSail(int minWindToSail)
	{
		this.minWindToSail = minWindToSail;
	}
	
	public Sail() 
	{
		wind = true;
		windSpeed = 0;
		boatName = "TBD";
		maxSpeed = 0;
		lOA = 0;
		sailorsPresent = 0;
		sailorsToCrew = 0;
		maxWindToSail = 0;
		minWindToSail = 0;
		
	};
	
	public Sail(boolean wind) 
	{
		this.wind = wind;
	};
	
	public Sail(int windSpeed, int sailorsPresent, int sailorsToCrew, int maxWindToSail) 
	{
		this.windSpeed = windSpeed;
		this.sailorsPresent = sailorsPresent;
		this.sailorsToCrew = sailorsToCrew;
		this.maxWindToSail = maxWindToSail;
		
	}
	
	public Sail(boolean wind, int windSpeed, String boatName, int maxSpeed, double lOA, int sailorsPresent, int sailorsToCrew, int maxWindToSail, int minWindToSail) 
	{
		this.wind = wind;
		this.windSpeed = windSpeed;
		this.boatName = boatName;
		this.maxSpeed = maxSpeed;
		this.lOA = lOA;
		this.sailorsPresent = sailorsPresent;
		this.sailorsToCrew = sailorsToCrew;
		this.maxWindToSail = maxWindToSail;
		this.minWindToSail = minWindToSail;
	}
	boolean readyToSail()
	{
		if(wind = true && sailorsPresent > sailorsToCrew && windSpeed < maxWindToSail)
		{
			return true;
		}
		return false;
	}
	
	public void tightenDown()
	{
		System.out.println("Harden those Sails!");
	}
	
	String rentBoat()
	{
		String yourChoice = boatName;
		return yourChoice;
		
		
	}
	
	
	
}




