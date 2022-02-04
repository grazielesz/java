package classes;

public class Car implements CarbonFootprint {
	
	private String gasType;
	private float cilindrada;

	public Car(String gasType, float cilindrada) {
		this.gasType = gasType;
		this.cilindrada = cilindrada;
	}

	public String getGasType() {
		return gasType;
	}
	public void setGasType(String gasType) {
		this.gasType = gasType;
	}

	public float getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public int getCarbonFootprint() {
		switch (gasType) {

			case "Eletrico": 
				return (int) cilindrada * 2;
			case "Gasolina": 
				return (int) cilindrada * 4;
			case "Diesel": 
				return (int) cilindrada * 3;
			default:
				return (int) (cilindrada * 1.3f);
		} 
	}
}
