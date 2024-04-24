import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1,"Raj",70));
		students.add(new Student(2,"Dev",85));
		students.add(new Student(3,"Aditya",60));
		
		for(Student s : students) {
			System.out.println(s);
		}
	}
}
class Student implements Comparable<Student>{
	int roll;
	String name;
	double marks;
	Student(int r, String n, double m) {
		roll = r;
		name = n;
		marks = m;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		return (int) (o.marks - this.marks);
	}
}
