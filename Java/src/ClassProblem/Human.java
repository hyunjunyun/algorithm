package ClassProblem;

public class Human {
	private String name;
	private int height;
	private int weight;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void weightGain(int weight) {
		this.weight += weight;
		System.out.println("ü���� "+weight+"��ŭ �����Ͽ����ϴ�.");
	}
	
	public void weightLose(int weight) {
		this.weight -= weight;
		System.out.println("ü���� "+weight+"��ŭ �����Ͽ����ϴ�.");
	}
	
	public void getInfo() {
		System.out.println(name+"���� ���� ������ "+height+"�̸� ���� ü���� "+weight+"kg �Դϴ�.");
	}
}