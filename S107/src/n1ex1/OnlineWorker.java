package n1ex1;

public class OnlineWorker extends Worker {
	
	private static final float TARIFA = 50;

	public OnlineWorker(String name, String surname, float pricePerHour) {
		super(name, surname, pricePerHour);
	}
	
	@Override
	public float calculateSalary(float monthlyHours) {
		return monthlyHours*pricePerHour + TARIFA;
	}

	
}
