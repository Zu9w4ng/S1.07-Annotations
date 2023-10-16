package n1ex1;

public class App {

	public static void main(String[] args) {
		
		Worker worker = new Worker("Marc", "Sánchez", 10);
		OnlineWorker onlineWorker = new OnlineWorker("Javi", "Peña", 15);
		OnSiteWorker onSiteWorker = new OnSiteWorker("Laura", "Domínguez", 14);
		
		System.out.println(worker.calculateSalary(110));
		System.out.println(onlineWorker.calculateSalary(100));
		System.out.println(onSiteWorker.calculateSalary(105));
	}

}
