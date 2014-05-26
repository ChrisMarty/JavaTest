package lab.view;

public class Car implements iCar {

	private String manufacturer;
	private String model;
	private int year;
	private String color;
	
	public Car(String model, int year, String manufacturer, String color) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	@Override
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	


}
