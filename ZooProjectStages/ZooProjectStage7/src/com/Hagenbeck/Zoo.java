package com.Hagenbeck;

public class Zoo {
	
	private static int numZoosCreated;
	private String location;
	
	public Zoo() {
		this("Unknown");
	}

	public Zoo(String location) {
		numZoosCreated++;
		//this.location=location;
		this.setLocation(location);
		System.out.println("\nConstructing "+this+" No:"+numZoosCreated);
		doSomething();
	}

	public void doSomething() {
		Manager manager=new Manager(this);
		manager.sayHello();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public void changeZoo(Zoo zoo, int avgVisitors) {
		avgVisitors=200;
		System.out.println("\n@Local Start:"+zoo);
		zoo=new Zoo("London");
		//zoo.setLocation("Munic");
		//this.setLocation("Amsterdam");
		System.out.println("\n@Local End:"+zoo);
	}

	public static int getNumZoosCreated() {
		return numZoosCreated;
	}	
	@Override
	public String toString() {
		return getClass().getSimpleName()+"("+this.getLocation()+")";		
	}	
}
