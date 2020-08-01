package lesson_practice;

public class School {
	
	private String name;
	
	private Student[] students;
	
	public School() {
		this.students = new Student[10];
	}

	public School(String name) {
		this();
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public void printStudents() {
		
		System.out.println("Welcome to "+name);
		
		System.out.println("\nThere are "+ students.length + "students in total.\n");
		
		System.out.println("The list of student: ");
		
		// print every students info
		for(Student s : students) {
			
			System.out.println(s.studentInfo());			
			
		}
		
	}
	
	

}
