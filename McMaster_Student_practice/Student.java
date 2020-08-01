package lesson_practice;

public class Student {
	
	private int id;
	
	private static int count = 0;
	
	private String name;
	
	private Laptop laptop; //从别的class里面提取object
	
	public Student() {
		
		count ++;
		
		laptop = new Laptop();//需要创建 laptop
				
	}

	public Student(String name) {
		this();// 首先会运行 default constructor
		this.id = count;
		this.name = name;
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
		
		return "Student: " + name + "\nID:" + id+ ""+"\n"+ laptop.LaptopInfo();
	}
	

}
