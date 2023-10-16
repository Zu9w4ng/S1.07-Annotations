package n1ex1;

public class Worker {
	
	protected String name, surname;
	protected float pricePerHour;
	
	public Worker(String name, String surname, float pricePerHour) {
		super();
		this.name = name;
		this.surname = surname;
		this.pricePerHour = pricePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public float getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(float pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public float calculateSalary(float workedHours) {
		return workedHours*pricePerHour;
	}

}
