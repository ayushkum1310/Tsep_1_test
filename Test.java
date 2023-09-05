package tsep;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Mycomp implements Comparator<Student>{

	@Override
	public int compare(Student o1,Student o2) {
		int x=o1.name.compareTo(o2.name);
		return x;
	}
	
}
public class Test {
	public static void main() {
		Studentservice service= new Studentservice();
		List<Student> list=service.displayStudents();
		System.out.println(list);
		Collections.sort(list,new Mycomp());
		System.out.println(list);
		
	}
}
