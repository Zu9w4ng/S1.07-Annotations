package n1ex1;

public class OnSiteWorker extends Worker {
	
	private static float gasoline = 100;

	public OnSiteWorker(String name, String surname, float pricePerHour) {
		super(name, surname, pricePerHour);
	}
	
	@Override
	public float calculateSalary(float monthlyHours) {
		return monthlyHours*pricePerHour + gasoline;
	}

	
}
