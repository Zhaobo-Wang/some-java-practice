package restaurant_sys_practice;

public class restaurant {

  // 第一步：创建一些attribute在class里面，private表示仅仅这个class可见
	
	private int address;
	
	private String name;
	
	private int michelin_level;
  
  //第二步：创建一个default constructor（如果要是想创建overloaded constructor，必须要创建default constructor/ 不然可以省略）
	
	public restaurant() {
		
	}
	
  // 创建一个overloaded constructor，this.address指向这个class里面的地址
  
	public restaurant(int address, String name, int michelin_level) {
		
		this.address = address;
		this.name = name;
		this.michelin_level = michelin_level;
		
	}
	
  // 第三步：创建getter/setter，getter可以读取到private的值，setter可以更改attribute的值（并且保护到指定的范围内）
  
	public void getAddress() {
		
		this.address = address;
		
	}

	public void setAddress(int address) {
		
		if(address < 0) {
			System.out.println("Error !");
			return;
		}
		this.address = address;
	}
  
  // 第四步：创建method/ toString（）method可以直接print object里attribute的所有属性
  
	public String toString() {
		return "restaurant [address=" + address + ", name=" + name + ", michelin_level=" + michelin_level + "]";
	}
	
  //以下这两个是overloaded function，格式为两个function name一模一样（只要parameter的数量 或者 type 不一样就可以用）
	public void printInfo() {
		
		System.out.println("The michelin level is originally "+ this.michelin_level);
	}
	
	public void printInfo(int michelin_level) {
		
		System.out.println("The micheline level now is changing from "+this.michelin_level+" to "+ michelin_level);
	}
	
}
