package lesson_practice;

public class Student {
	
	private int id;
	
	private static int count = 0;
	
	private String name;
	
	private Laptop laptop;
	
	public Student() {
		
		count ++;
		
		laptop = new Laptop();
				
	}

	public Student(String name, Laptop laptop) {
		this();// run this class default constructor
		this.id = count;
		this.name = name;
		this.laptop = laptop;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public String studentInfo() {
		
		return "...............\nStudent: " + name + "\nID:" + id+ ""+"\n"+ laptop.LaptopInfo();
	}
	

}

