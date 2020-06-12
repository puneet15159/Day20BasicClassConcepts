

abstract class AbstractioncClass {

	public void display() {
		System.out.println("inside the non-abstarct method abstract in abstract class ");
	}

	public abstract void favouriteGame();

}

class School {

	private String schoolName;

	public School(String schoolName) {
		super();
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}

class College {

	private String college;

	public College(String college) {
		super();
		this.college = college;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}

public class Day10Prob extends AbstractioncClass {
	private String name;
	private String city;
	private String number;
	private String state;

	public Day10Prob(String name, String city, String number, String state) {
		super();
		this.name = name;
		this.city = city;
		this.number = number;
		this.state = state;
	}

	public Day10Prob() {

	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getNumber() {
		return number;
	}

	public String getState() {
		return state;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Day10Prob [name=" + name + ", city=" + city + ", number=" + number + ", state=" + state + "]";
	}

	@Override
	public void favouriteGame() {
		System.out.println("inside abstarct method implemetation in derived class");

	}

	public static void main(String[] args) {
		Day10Prob day10Prob = new Day10Prob("Puneet", "Delhi", "9098726544", "Delhi");
		System.out.println("saved member: " + day10Prob.toString());

		Day10Prob day10Prob2 = new Day10Prob();
		day10Prob2.setName("puneet1");
		day10Prob2.setCity("jabalpur");
		day10Prob2.setNumber("1231212");
		day10Prob2.setState("MP");

		System.out.println("saved new member: " + day10Prob2.toString());

		day10Prob.display();
		day10Prob.favouriteGame();

		School school = new School("DAV");
		College college = new College("IIITD");

		System.out.println(day10Prob.getName() + "school is " + school.getSchoolName() + " and collge name is "
				+ college.getCollege());
	}

}
