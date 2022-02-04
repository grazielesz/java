package classes;

public abstract class Building implements CarbonFootprint {
	
	private int people;
	private boolean isRenewableEnergy;
	private int lamps;
	private boolean isUsingAirCondicioning;
	
	public Building(int people, boolean isRenewableEnergy, int lamps, boolean isUsingAirCondicioning) {
		this.people = people;
		this.isRenewableEnergy = isRenewableEnergy;
		this.lamps = lamps;
		this.isUsingAirCondicioning = isUsingAirCondicioning;
	}

	public boolean isUsingAirCondicioning() {
		return isUsingAirCondicioning;
	}
	public void setUsingAirCondicioning(boolean isUsingAirCondicioning) {
		this.isUsingAirCondicioning = isUsingAirCondicioning;
	}
	
	public int getLamps() {
		return lamps;
	}
	public void setLamps(int lamps) {
		this.lamps = lamps;
	}
	
	public boolean isRenewableEnergy() {
		return isRenewableEnergy;
	}
	public void setRenewableEnergy(boolean isRenewableEnergy) {
		this.isRenewableEnergy = isRenewableEnergy;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	public int getPeople() {
		return people;
	}

	@Override
	public int getCarbonFootprint() {
		return people * lamps * (isUsingAirCondicioning ? 2 : 1) - (isRenewableEnergy ? 10 : 0) ;
	}
}
