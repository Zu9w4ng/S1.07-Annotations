package n1ex2;

public class OnSiteWorker extends Worker {
	
	private static float gasoline = 100;

	public OnSiteWorker(String name, String surname, float pricePerHour) {
		super(name, surname, pricePerHour);
	}
	
	@Override
	public float calculateSalary(float monthlyHours) {
		return monthlyHours*pricePerHour + gasoline;
	}
	
	@Deprecated
	public float salary(float monthlyHours) {
		return monthlyHours*pricePerHour;
	}

	
}
