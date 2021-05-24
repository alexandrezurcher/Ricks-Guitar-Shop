
public class Guitar {
	
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	//properties of GuitarSpec are encapsulated
	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString){
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = new GuitarSpec(builder, model, type, backWood, topWood, numString);
	}
	
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public GuitarSpec getSpec() {
		return spec;
	}

}