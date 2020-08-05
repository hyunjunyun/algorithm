package ClassProblem;

public class Car {

	private String name;
	private int width;
	private String garage;
	private int tankCapacity;
	private int fuel;
	private int fuel_efficiency;
	private int distance;

	public Car(String name, int width, String garage, int tankCapacity, int fuel, int fuel_effeciency, int distance) {
		this.name = name;
		this.width = width;
		this.garage = garage;
		this.tankCapacity = tankCapacity;
		this.fuel = fuel;
		this.fuel_efficiency = fuel_effeciency;
		this.distance = distance;
	}

	public boolean moveCar() {
		int usefuel = distance * fuel_efficiency;
		if (usefuel > fuel) {
			return false;
		}
		return true;
	}
	
	public void showStatus() {
		if (moveCar() == true) {
			System.out.println("�̵��� �����մϴ�.");
		}else {
			System.out.println("�̵��� �Ұ����մϴ�.");
		}
	}
}
