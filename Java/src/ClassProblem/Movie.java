package ClassProblem;

public class Movie {
	private String movie_name;
	private double grade;
	private String director;

	public Movie(String movie_name, double grade, String director) {
		this.movie_name = movie_name;
		this.grade = grade;
		this.director = director;
	}

	void print() {
		System.out.printf("��ȭ�� �̸��� %s�̰� ������ %s�̸� ������ �̸��� %s�Դϴ�.", movie_name, grade, director);
	}
}
