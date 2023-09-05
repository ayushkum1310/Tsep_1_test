package tsep;
import java.util.ArrayList;
import java.util.List;
public class Studentservice {
	public List<Student> displayStudents(){
		
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,"Ayush",0));
		list.add(new Student(2,"Xyz",0));
		list.add(new Student(3,"HJ",0));
		list.add(new Student(4,"Da",0));
		return list;
	}
}
