package tsep;

public class Student {
	int id;
	String name;
	float salary;
	public Student(int id, String name ,float salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}
